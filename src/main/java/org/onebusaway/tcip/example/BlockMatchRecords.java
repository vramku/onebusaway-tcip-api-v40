package example;

import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.ift.CellProcessor;

public class BlockMatchRecords {
	
	String agencyid;
	String gtfsserviceid;
	String serviceid;
	String blockId; 
	String tripId;
	String dsc;
	int firstStop;
	double firstStopTime;
	int lastStop;
	double lastStopTime;
	String runId;
	String reliefRunId;
	double recoveryTime;
	boolean firstInSeq;
	boolean lastInSeq; 
	String signCodeRoute;
	String routeId;
	
	public BlockMatchRecords(){
		
	}
	
	protected CellProcessor[] getProcessor() {
		final CellProcessor[] processors = new CellProcessor[] { 
				new Optional(),
				new Optional(),
				new Optional(),
				new Optional(),
				new Optional(),
				new Optional(),
				new Optional(),
				new Optional(),
				new Optional(),
				new Optional(),
				new Optional(),
				new Optional(),
				new Optional(),
				new Optional(),
				new Optional(),
				new Optional(),
				new Optional(),
		};
		return processors;
	}

	public String getAgencyid() {
		return agencyid;
	}

	public void setAgencyid(String agencyid) {
		this.agencyid = agencyid;
	}

	public String getGtfsserviceid() {
		return gtfsserviceid;
	}

	public void setGtfsserviceid(String gtfsserviceid) {
		this.gtfsserviceid = gtfsserviceid;
	}

	public String getServiceid() {
		return serviceid;
	}

	public void setServiceid(String serviceid) {
		this.serviceid = serviceid;
	}

	public String getBlockId() {
		return blockId;
	}

	public void setBlockId(String blockId) {
		this.blockId = blockId;
	}

	public String getTripId() {
		return tripId;
	}

	public void setTripId(String tripId) {
		this.tripId = tripId;
	}

	public String getDsc() {
		return dsc;
	}

	public void setDsc(String dsc) {
		this.dsc = dsc;
	}

	public int getFirstStop() {
		return firstStop;
	}

	public void setFirstStop(String firstStop) {
		this.firstStop = Integer.parseInt(firstStop);
	}

	public double getFirstStopTime() {
		return firstStopTime;
	}

	public void setFirstStopTime(String firstStopTime) {
		this.firstStopTime = Double.parseDouble(firstStopTime);
	}

	public int getLastStop() {
		return lastStop;
	}

	public void setLastStop(String lastStop) {
		this.lastStop = Integer.parseInt(lastStop);
	}

	public double getLastStopTime() {
		return lastStopTime;
	}

	public void setLastStopTime(String lastStopTime) {
		this.lastStopTime = Double.parseDouble(lastStopTime);
	}

	public String getRunId() {
		return runId;
	}

	public void setRunId(String runId) {
		this.runId = runId.replaceFirst("^0+(?!$)", "");
	}

	public String getReliefRunId() {
		return reliefRunId;
	}

	public void setReliefRunId(String reliefRunId) {
		this.reliefRunId = reliefRunId;
	}

	public double getRecoveryTime() {
		return recoveryTime;
	}

	public void setRecoveryTime(String recoveryTime) {
		this.recoveryTime =  Double.parseDouble(recoveryTime);
	}

	public boolean isFirstInSeq() {
		return firstInSeq;
	}

	public void setFirstInSeq(String firstInSeq) {
		this.firstInSeq = Boolean.parseBoolean(firstInSeq);
	}

	public boolean isLastInSeq() {
		return lastInSeq;
	}

	public void setLastInSeq(String lastInSeq) {
		this.lastInSeq = Boolean.parseBoolean(lastInSeq);
	}

	public String getSignCodeRoute() {
		return signCodeRoute;
	}

	public void setSignCodeRoute(String signCodeRoute) {
		this.signCodeRoute = signCodeRoute;
	}

	public String getRouteId() {
		return routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}
	
}
