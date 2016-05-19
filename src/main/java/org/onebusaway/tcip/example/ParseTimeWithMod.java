package example;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.supercsv.cellprocessor.CellProcessorAdaptor;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.exception.SuperCsvCellProcessorException;
import org.supercsv.util.CsvContext;

public class ParseTimeWithMod extends CellProcessorAdaptor {
	
	public ParseTimeWithMod(){
		super();
	}
	
	public ParseTimeWithMod(final CellProcessor next){
		super(next);
	}
	
    public Object execute(final Object value, final CsvContext context) {
        
        validateInputNotNull(value, context); // throws an Exception if the input is null
        
        String str = value.toString();
        
		String[] parts= str.split(":");
		char modifier= str.charAt(str.length() - 1);
		int hour = Integer.parseInt(parts[0]);
		parts[1]=parts[1].replaceAll(modifier+"", "");
		int minute = Integer.parseInt(parts[1].replaceAll(modifier+"", "")); 
		
		DateTime time = new DateTime();
		time.withHourOfDay(hour);
		time.withMinuteOfHour(minute);
        
		if (modifier =='B'){
			time.minusDays(1);
		}
		
		if (modifier == 'X'){
			time.plusDays(1);
		}
		
		try {
			return next.execute(time, context);
		} catch (Exception e) {
			throw new SuperCsvCellProcessorException(
	                String.format("Could not parse '%s' as a time", value), context, this);
		}
		
        
}

}
