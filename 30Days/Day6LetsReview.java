package hackerRank.thirtyDays;

import java.io.*;
import java.util.*;

public class Day6LetsReview {
	private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int T =      		scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int i=1;i<=T;i++){
        	String s=scanner.next();        	        	
        	String oddS="";
        	String evenS="";
        	for(int j=0;j<s.length();j++) {
        		if(j==0||j%2 ==0)
        			evenS+=s.charAt(j);
        		else
        			oddS+=s.charAt(j);
        	}
        	System.out.println(evenS+" "+oddS);
        }
        scanner.close();


    }
}
