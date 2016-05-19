package example;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.validation.Schema;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.ICsvBeanReader;
import org.supercsv.prefs.CsvPreference;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;

import config.AppConfig;
import config.BlockMatchConfig;
import config.TimeManipulation;
import config.UTSConfig;

import tcip_final_4_0_0.CPTOperatorIden;
import tcip_final_4_0_0.CPTSubscriptionHeader;
import tcip_final_4_0_0.CPTTransitFacilityIden;
import tcip_final_4_0_0.CPTVehicleIden;
import tcip_final_4_0_0.ObaSchPullOutList;
import tcip_final_4_0_0.ObjectFactory;
import tcip_final_4_0_0.SCHBlockIden;
import tcip_final_4_0_0.SCHOperatorAssignment.DayTypes;
import tcip_final_4_0_0.SCHPullInOutInfo;
import tcip_final_4_0_0.SCHRunIden;
import tcip_final_4_0_0.SchPullOutList.PullOuts;


public class PullInPullOutFromFile {
	JAXBContext jc;
	DatatypeFactory df = null;
	Schema schema = null;
	Map<String, String> BlockMapping = new HashMap<String, String>();
	TimeManipulation Clock = new TimeManipulation();
	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	AppConfig ConfigApp = ctx.getBean(AppConfig.class);
	static String ParsingError = "0";
	static String ParsingErrorMSG = "None";
	
	public static void main(String[] args) throws IOException, JAXBException {

	//	UTSPullOutRecord po = new UTSPullOutRecord();
		PullInPullOutFromFile POPI = new PullInPullOutFromFile();
		POPI.parseBlocksMatchFileToBeanList();
	
		// Manually
	//	ObaSchPullOutList pullOuts = POPI.makePullOuts();
		
		// From UTS
		ObaSchPullOutList pullOuts = POPI.getPullOuts();

		ObjectFactory f = new ObjectFactory();
		JAXBElement<ObaSchPullOutList> pullOutListElement = f
				.createObaSchPullOutList(pullOuts);
		Marshaller m = JAXBContext.newInstance(ObjectFactory.class)
				.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		StringWriter writer = new StringWriter();

		m.marshal(pullOutListElement, writer);
	//	String xml = writer.toString();

		JaxbAnnotationModule module = new JaxbAnnotationModule();
		ObjectMapper om = new ObjectMapper();
		om.registerModule(module);
		om.setSerializationInclusion(Include.NON_NULL);
		String s = om.writeValueAsString(pullOuts);

		System.out.println(s);
	}

	// 
	public ObaSchPullOutList getPullOuts(){

		
		ObaSchPullOutList pullOutsList = new ObaSchPullOutList();
		//load file,

		LocalTime beginTime = new LocalTime(Clock.getServerTime());
		DateTime beginDateTime = new DateTime(Clock.getServerDateTime());
		DateTime deactivationTime = new DateTime("2040-01-04T23:59");
		//DateTime deactivationTime = new DateTime(Clock.getServerDateTime(ConfigApp.getTimeExpiration()));
		LocalTime endTime = new LocalTime(Clock.getServerTime(ConfigApp.getTimeExpiration()));
		DateTime endDateTime = Clock.getServerDateTime(ConfigApp.getTimeExpiration());
		LocalTime aDifferentTime = new LocalTime(Clock.getServerTimewithSeconds());
		LocalDate aDay = new LocalDate(Clock.getServerDate());

		CPTSubscriptionHeader subHeader = new CPTSubscriptionHeader();
		subHeader.setRequestedType("Event");
		subHeader.setRequestIdentifier(BigInteger.ONE);
		subHeader.setPublisherIdentifier(BigInteger.ZERO);
		subHeader.setSubscriberIdentifier(BigInteger.ZERO);
		subHeader.setExpirationTime(aDifferentTime);

		pullOutsList.setSubscriptionInfo(subHeader);
		pullOutsList.setBeginDate(aDay);
		pullOutsList.setBeginTime(beginTime);
		try {
			pullOutsList.setPullOuts(parseUTSFileToBeanList());
		} catch (IOException e) {
				ParsingError = "1";
				ParsingErrorMSG = e.getMessage();
		}
		
		pullOutsList.setEndTime(endTime);
		pullOutsList.setEndDate(aDay);
		pullOutsList.setCreated(beginDateTime);
		pullOutsList.setSchVersion("TCIP 4.0");
		pullOutsList.setSourceapp(ConfigApp.getAppName());
		pullOutsList.setErrorCode(ParsingError);
		pullOutsList.setErrorDescription(ParsingErrorMSG);
		pullOutsList.setNoNameSpaceSchemaLocation("http://www.aptatcip.com/APTA-TCIP-S-01%204.0_files/Schema%20Set.zip");
		pullOutsList.setDeactivation(deactivationTime);

		return pullOutsList;
	}

	private SCHPullInOutInfo UTSPullOuts(UTSPullOutRecord record)
	{ 
		
		CPTTransitFacilityIden depot = new CPTTransitFacilityIden();
		depot.setId(record.getDepot());
		depot.setAgdesig(record.getAuthid());

		// TODO: What's this?
		DayTypes dt = new DayTypes();
		dt.getDayType().add("255");

		CPTVehicleIden bus = new CPTVehicleIden();
		BigInteger mtaAgencyID = BigInteger.valueOf(2008);
		bus.setAg(mtaAgencyID);
		bus.setId(record.getBusnumber());

		CPTOperatorIden Operator = new CPTOperatorIden();
		Operator.setId(record.getPass());
		Operator.setAg(mtaAgencyID);
		Operator.setDesig(record.getAuthid()+record.getPass());

		SCHBlockIden block = new SCHBlockIden();
		String RouteRun = record.getRoute()+"-"+record.getRunnumber();
		
		// Get the block
		if(BlockMapping.containsKey(RouteRun))
			block.setId(BlockMapping.get(RouteRun));
		else
			block.setId(ConfigApp.getMissingBlock());

		SCHRunIden run = new SCHRunIden();
		run.setId(record.getRunnumber());
		
		
		
		
		SCHPullInOutInfo PullOut = new SCHPullInOutInfo();
		
		boolean isItAPullIn = false;
		
		DateTime EventTime = record.getSchedpo();
		if(record.getActualpi() != null){
			isItAPullIn = true;
			EventTime = record.getActualpi();
		}
		
		
		PullOut.setVehicle(bus);
		PullOut.setOperator(Operator);
		PullOut.setTime(EventTime);
		PullOut.setPullIn(isItAPullIn);
		PullOut.setGarage(depot);
		PullOut.setDate(record.getDate());
		PullOut.setBlock(block);
		PullOut.setRun(run);
		
		return PullOut;
				
	}
	
	
	private void parseBlocksMatchFileToBeanList() throws IOException {

		ICsvBeanReader beanReader = null;
		@SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(BlockMatchConfig.class);
		BlockMatchConfig Config = ctx.getBean(BlockMatchConfig.class);
		BlockMatchRecords Block = new BlockMatchRecords();
		
		try {
			
				//Get file from resources folder
				ClassLoader classLoader = getClass().getClassLoader();
				File file = new File(classLoader.getResource(Config.getBlockMatchDir()).getFile());
				beanReader = new CsvBeanReader(new FileReader(file), CsvPreference.STANDARD_PREFERENCE);

				// the header elements are used to map the values to the bean (names must match)
				final String[] header = beanReader.getHeader(true);
				final CellProcessor[] processors = Block.getProcessor();
				BlockMatchRecords record;
				// header variables are corrected to reflect super
				for(int i = 0; i < header.length; i++){
					header[i] = header[i].charAt(0)+header[i].replaceAll("_","").toLowerCase().substring(1);
				}
				
				while( ( record = beanReader.read(Block.getClass(), header, processors)) != null ) {
					
					if(record.getTripId().contains("pullout_"))
					{
						if(BlockMapping.containsKey(record.getReliefRunId()))
							System.out.println("Duplicate Run "+record.getRouteId());
						
						BlockMapping.put(record.getRunId(),record.getBlockId());
					//	System.out.println(record.getBlockId());
					}
				}

			

		}catch(Exception e){
			ParsingError = "1";
			ParsingErrorMSG = e.getMessage();
		}
		finally {
			if( beanReader != null ) {
				beanReader.close();
			}
		}
	}
	
	
	private PullOuts parseUTSFileToBeanList() throws IOException {

		ICsvBeanReader beanReader = null;
		@SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(UTSConfig.class);
		UTSConfig Config = ctx.getBean(UTSConfig.class);
		UTSPullOutRecord UTS = new UTSPullOutRecord();
		ObaSchPullOutList.PullOuts pullOuts = new ObaSchPullOutList.PullOuts();
		try {
			
				//Get file from resources folder
				ClassLoader classLoader = getClass().getClassLoader();
				File file = new File(classLoader.getResource(Config.getUtsDir()).getFile());
				beanReader = new CsvBeanReader(new FileReader(file), CsvPreference.STANDARD_PREFERENCE);

				// the header elements are used to map the values to the bean (names must match)
				final String[] header = beanReader.getHeader(true);
				final CellProcessor[] processors = UTS.getProcessors();
				UTSPullOutRecord record;
				// header variables are corrected to reflect super
				for(int i = 0; i < header.length; i++){
					header[i] = header[i].charAt(0)+header[i].replaceAll(" ","").toLowerCase().substring(1);
				}
				
				while( ( record = beanReader.read(UTS.getClass(), header, processors)) != null ) {
				
					
					pullOuts.getPullOut().add(UTSPullOuts(record));
				//	System.out.println(record.toString());
				//	System.out.println(String.format("lineNo=%s, rowNo=%s, customer=%s", beanReader.getLineNumber(),
				//			beanReader.getRowNumber(), record));
				}

			

		}catch(Exception e){
			ParsingError = "1";
			ParsingErrorMSG = e.getMessage();
		}
		finally {
			if( beanReader != null ) {
				beanReader.close();
			}
		}
		return pullOuts;
	}

	//TODO: Simple Pullout Builder
	// CcReportPullOuts meets the description, but is trip and not
	// block-centric. D'oh!
	public static  ObaSchPullOutList makePullOuts() {
		//load file,

		//iterate over records
		LocalTime beginTime = new LocalTime("04:59");
		DateTime beginDateTime = new DateTime("2011-06-01T04:59");
		DateTime deactivationTime = new DateTime("2040-01-04T23:59");
		LocalTime endTime = new LocalTime("00:49");
		DateTime endDateTime = new DateTime("2011-06-02T00:49");

		LocalTime aDifferentTime = new LocalTime("19:00:00");
		LocalDate aDay = new LocalDate("2011-06-01");
		// LocalDate anotherDay = new LocalDate("2011-06-02");

		CPTSubscriptionHeader subHeader = new CPTSubscriptionHeader();
		subHeader.setRequestedType("Event");
		subHeader.setRequestIdentifier(BigInteger.ONE);
		subHeader.setPublisherIdentifier(BigInteger.ZERO);
		subHeader.setSubscriberIdentifier(BigInteger.ZERO);
		subHeader.setExpirationTime(aDifferentTime);

		BigInteger mtaAgencyID = BigInteger.valueOf(2008);

		CPTTransitFacilityIden depot = new CPTTransitFacilityIden();
		depot.setId("CSLT");
		depot.setAgdesig("MTA NYCT");

		CPTTransitFacilityIden depot2 = new CPTTransitFacilityIden();
		depot2.setName("YUKN");

		DayTypes dt = new DayTypes();
		dt.getDayType().add("255");

		CPTVehicleIden bus1 = new CPTVehicleIden();
		bus1.setAg(mtaAgencyID);
		bus1.setId("7777");

		CPTOperatorIden firstOp = new CPTOperatorIden();
		firstOp.setId("859007");
		firstOp.setAg(mtaAgencyID);
		firstOp.setDesig("TA859007");

		SCHBlockIden block1 = new SCHBlockIden();
		// block designator: depot_rt_run_date_time
		block1.setId("MTA NYCT_20120206_CSLT_S56_001");

		SCHRunIden run0 = new SCHRunIden();
		run0.setId("S56-001");

		SCHPullInOutInfo po1 = new SCHPullInOutInfo();
		po1.setVehicle(bus1);
		po1.setTime(beginDateTime);
		po1.setPullIn(false);
		po1.setGarage(depot);
		po1.setDate(aDay);
		po1.setOperator(firstOp);
		po1.setBlock(block1);
		po1.setRun(run0);

		SCHPullInOutInfo pi1 = new SCHPullInOutInfo();
		pi1.setVehicle(bus1);
		pi1.setTime(endDateTime);
		pi1.setPullIn(true);
		pi1.setGarage(depot);
		pi1.setDate(aDay);
		pi1.setBlock(block1);
		pi1.setRun(run0);

		ObaSchPullOutList.PullOuts pullOuts = new ObaSchPullOutList.PullOuts();
		pullOuts.getPullOut().add(po1);
		pullOuts.getPullOut().add(pi1);

		ObaSchPullOutList pullOutsList = new ObaSchPullOutList();
		pullOutsList.setSubscriptionInfo(subHeader);
		pullOutsList.setBeginDate(aDay);
		pullOutsList.setBeginTime(beginTime);
		pullOutsList.setPullOuts(pullOuts);
		pullOutsList.setEndTime(endTime);
		pullOutsList.setEndDate(aDay);
		pullOutsList.setCreated(beginDateTime);
		pullOutsList.setSchVersion("TCIP 4.0");
		pullOutsList.setSourceapp("YardBoss");
		pullOutsList.setErrorCode("1");
		pullOutsList.setErrorDescription("Sample error description");
		pullOutsList
		.setNoNameSpaceSchemaLocation("http://www.aptatcip.com/APTA-TCIP-S-01%204.0_files/Schema%20Set.zip");
		pullOutsList.setDeactivation(deactivationTime);

		return pullOutsList;
	}

}
