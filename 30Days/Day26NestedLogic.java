package hackerRank.thirtyDays;


import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.*;

import java.time.format.*;



public class Day26NestedLogic {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc=new Scanner(System.in);
    	
    	int Da=sc.nextInt();
    	int Ma=sc.nextInt();
    	int Ya=sc.nextInt();
    	
    	int De=sc.nextInt();
    	int Me=sc.nextInt();
    	int Ye=sc.nextInt();
    	
    	
    	LocalDate a = LocalDate.of(Ya, Ma,Da);
    	LocalDate e = LocalDate.of(Ye, Me,De);
    	Period p = Period.between(e, a);
    	int days = p.getDays();
    	System.out.println("Years-->"+p.getYears()+" Months-->"+p.getMonths()+" Days-->"+days);
    	int fine=0;
    	if(days>0) {
    		if(Ya>Ye) {
    			fine = 10000;
    		}else if(Ya==Ye && Ma > Me) {    			
    			fine = 500 *p.getMonths();
    		}else if(Ya==Ye && Ma==Me && Da>De) {
    			fine = 15 * p.getDays();
    		}
    	}else {
    		fine =0;
    	}
    	System.out.println(fine);
    	
    	
    }
}

