package config;
/**
 * 
 * @author Visar Ramku
 * 
 * Copyright 2013-2014 Metropolitan Transportation Authority (New York City Transit) - All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;

public class TimeManipulation {

	public final String min_date = "1970-00-00 00:00:00";
	
	public TimeManipulation()
	{
		
	}
	
	/**
	 * 
	 * @param LocalDate Date
	 * @param String Time 
	 */
	
	public DateTime EventDateTime(LocalDate Date, String Time){
		
		if(Time == null)
			return null;
		
		char modifier = Time.charAt(Time.length()-1);
		Time = Time.substring(0,Time.length()-1);
		
		if (modifier =='B'){
			Date.minusDays(1);
		}
		
		if (modifier == 'X'){
			Date.plusDays(1);
		}
		LocalTime timeformat = new LocalTime(Time);
		
		return Date.toDateTime(timeformat);
	}
	
	public DateTime getServerDateTime(){
		DateTime dateTime = new DateTime();
		return dateTime;	
	}
	
	public DateTime getServerDateTime(int Offset){
		DateTime dateTime = new DateTime();
		dateTime = dateTime.plusHours(Offset);
	   	return dateTime; 
	}
	
	public String getServerDate(){
		Date date = new Date();
	   	SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		return sdf1.format(date);	
	} 
	
	public String getServerTime(){
		Date date = new Date();
	   	SimpleDateFormat sdf1=new SimpleDateFormat("HH:mm");
		return sdf1.format(date);	
	}
	
	
	public String getServerTimewithSeconds(){
		Date date = new Date();
	   	SimpleDateFormat sdf1=new SimpleDateFormat("HH:mm:ss");
		return sdf1.format(date);	
	}
	public String getServerTime(int Offset){
		LocalTime Time = new LocalTime();
		Time = Time.plusHours(Offset);
		DateTimeFormatter outputFormat = new DateTimeFormatterBuilder().appendPattern("HH:mm").toFormatter();
		return Time.toString(outputFormat);	
	}
}
