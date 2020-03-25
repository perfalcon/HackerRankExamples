package hackerRank;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.*;

public class JavaCurrencyFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String amt="12324.134";
		double payment=0.999;
				//Double.parseDouble(amt);
		System.out.println("dAmt-->"+payment);
	
		String str = NumberFormat.getInstance().format(payment);
		System.out.println(str);
		
		
	    String symbol =getCurrencySymbol(Locale.SIMPLIFIED_CHINESE); 
	    
	    
	    
		NumberFormat nf = NumberFormat.getInstance(Locale.US);
		nf.setMaximumFractionDigits(2);
		nf.getRoundingMode();
		Locale indiaLocale = new Locale("en","IN");
		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
		NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		
		System.out.println("US: "+us.format(payment));
		System.out.println("India: "+india.format(payment));
		System.out.println("China: "+china.format(payment));
		System.out.println("France: "+france.format(payment));
		
		/*
		 * System.out.println("US: "+getCurrencySymbol(Locale.US)+getFormattedNumber(
		 * Locale.US,dAmt));
		 * System.out.println("India: Rs."+getFormattedNumber(Locale.ENGLISH,dAmt));
		 * System.out.println("China: "+getCurrencySymbol(Locale.CHINA)+
		 * getFormattedNumber(Locale.CHINA,dAmt));
		 * System.out.println("France: "+getCurrencySymbol(Locale.FRANCE)+
		 * getFormattedNumber(Locale.FRANCE,dAmt));
		 */
		  
	}

	private static String getFormattedNumber(Locale locale, double amt) {
		
		NumberFormat nf = NumberFormat.getInstance(locale);		
		//nf.setMaximumFractionDigits(2);
		//nf.setRoundingMode(RoundingMode.HALF_UP);
		System.out.println(nf.getRoundingMode());
		//System.out.printf("%.2f",Double.parseDouble(nf.format(amt)));
		if (nf instanceof DecimalFormat) {
            System.out.println(": " + ((DecimalFormat) nf).toPattern());
        }
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("--->"+String.format("%.2f",amt));
		
		return nf.format(Double.parseDouble(String.format("%.2f",amt)));
		
	}

	private static String getCurrencySymbol(Locale locale) {
	    Currency cur1 = Currency.getInstance(locale);
	    return cur1.getSymbol(locale);
	}

}
