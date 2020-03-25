package hackerRank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaDateandTime {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		String dateStr="08 05 2015";
		
		
		int month=8, day=5,year=2015;
		SimpleDateFormat sdf = new SimpleDateFormat("MM dd yyyy");
		
		dateStr= month+" "+day+" "+year;
		Date date = sdf.parse(dateStr);

		Calendar cal = Calendar.getInstance();
		
		//cal.set(2020, 2, 28);
		cal.setTime(date);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(Calendar.FRIDAY);
		
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.SUNDAY:System.out.println("SUNDAY");break;
		case Calendar.MONDAY:System.out.println("MONDAY");break;
		case Calendar.TUESDAY:System.out.println("TUESDAY");break;
		case Calendar.WEDNESDAY:System.out.println("WEDNESDAY");break;
		case Calendar.THURSDAY:System.out.println("THURSDAY");break;
		case Calendar.FRIDAY:System.out.println("FRIDAY");break;		
		case Calendar.SATURDAY:System.out.println("SATURDAY");break;
		}
		

	}

}
