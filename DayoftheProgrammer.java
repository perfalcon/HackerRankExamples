package hackerRank;

import java.util.Calendar;

public class DayoftheProgrammer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  year = 1918				;
		
		boolean leapYear = false;
		if(year>=1700 && year<=2700) {
			if(year <1919) {
				if(year % 4 ==0) {
					leapYear = true;
				}
			}
			if(year>=1919) {
				if(year%400==0 ||(year%4==0&&year%100!=0)) {
						leapYear=true;
				}
			}	
		}
		
		
		System.out.println(year+"--"+leapYear);
		
		
		int days=leapYear?244:243;
		
		int day = 256-days;
		if(year==1918)
			day = day+13;
		String dayOfProgrammer=day+"."+"09"+"."+year;
		System.out.println(dayOfProgrammer);
		
	}

}
