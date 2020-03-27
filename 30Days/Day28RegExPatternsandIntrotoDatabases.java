package hackerRank.thirtyDays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day28RegExPatternsandIntrotoDatabases {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<String>fnames = new ArrayList<String>(); 
        		
        
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            
            String pattern ="(.*)\\@gmail\\.com";
            
            if(emailID.matches(pattern)) {
            	System.out.println(emailID);
            	fnames.add(firstName);
            }else {
            	System.out.println("Not Found");
            }
            
        }
        
        String [] fname = new String[fnames.size()];
        fname=fnames.toArray(fname);
        Arrays.sort(fname);
        for(String s: fname) {
        	System.out.println(s);
        }

        scanner.close();
    }
}
