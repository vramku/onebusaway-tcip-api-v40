package example;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.cellprocessor.joda.ParseLocalDate;

import config.TimeManipulation;

public class UTSPullOutRecord {
	String route;
	String depot;
	String runnumber;
	LocalDate date;
	String schedpo;
	String actualpo;
	String schedpi;
	String actualpi;
	String busnumber;
	double busmileage;
	String pass;
	String authid;
	DateTime zeroDate;
	TimeManipulation Clock = new TimeManipulation();
	
	public UTSPullOutRecord(){
		
	}
	
	protected CellProcessor[] getProcessors() {
		final CellProcessor[] processors = new CellProcessor[] { 
				new NotNull(),
				new NotNull(),
				new NotNull(),
				new ParseLocalDate(),
				new NotNull(),
				new Optional(),
				new NotNull(),
				new Optional(),
				new Optional(),
				new NotNull(),
				new Optional(),
				new NotNull(),
		};
		return processors;
	}
	public String getRoute() {
		return route;
	}


	public void setRoute(String route) {
		this.route = route;
	}


	public String getDepot() {
		return depot;
	}


	public void setDepot(String depot) {
		this.depot = depot;
	}


	public String getRunnumber() {
		return runnumber;
	}


	public void setRunnumber(String runnumber) {
		// remove leading zero
		this.runnumber = runnumber.replaceFirst("^0+(?!$)", "");;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public DateTime getSchedpo() {
		return Clock.EventDateTime(date,schedpo);
	}


	public void setSchedpo(String intime) {
		this.schedpo = intime;
	}


	public DateTime getActualpo() {
		if(actualpo.isEmpty())
			return zeroDate;
		else
		return Clock.EventDateTime(this.date, actualpo);
	}


	public void setActualpo(String intime) {
		this.actualpo = intime;
	}


	public DateTime getSchedpi() {
		return Clock.EventDateTime(this.date,schedpi);
	}


	public void setSchedpi(String intime) {
		
		this.schedpi  = intime;
	}


	public DateTime getActualpi() {
			return Clock.EventDateTime(this.date,actualpi);
	}


	public void setActualpi(String intime) {
		
		this.actualpi  = intime;
	}


	public String getBusnumber() {
		return busnumber;
	}


	public void setBusnumber(String busnumber) {
		this.busnumber = busnumber;
	}


	public double getBusmileage() {
		return busmileage;
	}


	public void setBusmileage(String busmileage) {
		this.busmileage = Double.parseDouble(busmileage);
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getAuthid() {
		return authid;
	}


	public void setAuthid(String authid) {
		if(authid.equals("TA") || authid.equals("OA") )
			this.authid = "MTA NYCT";
		else if(authid.equals("RB"))
			this.authid = "MTABC";
		else	
			this.authid = authid;
	}

}
