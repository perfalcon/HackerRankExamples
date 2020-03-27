package hackerRank.thirtyDays;


import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Day25RunningTimeandComplexity {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Scanner sc=new Scanner(System.in);
    	int n= sc.nextInt();
    	for (int i=0;i<n;i++) {
    		//String a = sc.next();
    		//BigInteger b = new BigInteger(a);
    		//if(b.isProbablePrime(1)) {
    		
    		int a = sc.nextInt();
    		//if(checkPrime(a)) {
    		if(checkPrime1(a)) {
    		
    			System.out.println("Prime");
    		}else {
    			System.out.println("Not Prime");
    		}	
    	}
    }

	private static boolean checkPrime1(int a) {
		if(a<=1) return false;
		if(a<=3) return true;
		if(a%2 ==0 || a%3==0) return false;
		for(int i=5;i*i <=a;i+=6) {
			if(a%i==0 || a%(i+2)==0) {
				return false;
			}
		}
		return true;
	}

	private static boolean checkPrime(int a) {		
		if(a<=1)
            return false;
         if(a<=3) 
            return true;
            
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				return false;
			}
		}		
		return true;
	}
}