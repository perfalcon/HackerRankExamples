package hackerRank.thirtyDays;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day29BitwiseAND {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);
            
            if(((k-1)|k) > n && k%2==0){
                System.out.println(k-2);
            }else{
                System.out.println(k-1);               
            }
            
            
            int a[]= new int[n];
            for(int i=0;i<n;i++) {
            	a[i]=i+1;
            }
			/*
			 * for(int x : a) System.out.print(x+" ");
			 */
           // System.out.println();
            
            int bitAnd=0;
            Set <Integer>maxPV= new HashSet<Integer>();
            
            for(int i=0;i<n;i++) {
            	for(int j=i+1;j<n;j++) {            		
            		bitAnd = a[i]&a[j];
            		//System.out.println(a[i]+" "+a[j]+" =="+bitAnd);  
            		if(bitAnd < k) {
            			maxPV.add(bitAnd);
            		}
            	}
            }
            
            //System.out.println("Max Possible Value -->"+bitAnd);
            //System.out.println(Arrays.toString(maxPV.toArray()));
            Integer[] max = new Integer[maxPV.size()];
            max = maxPV.toArray(max);
           // System.out.println(Arrays.toString(max));
            Arrays.sort(max);
            //System.out.println(max[max.length-1]);
            
        }

        scanner.close();
        
    }
    
}
