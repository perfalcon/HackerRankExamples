package hackerRank.thirtyDays;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
  	Difference(int[] a){
  		this.elements =a;
  	}
  	public void computeDifference() {

  		maximumDifference=0;

  		for(int j=0;j<elements.length;j++) {
  			for(int i=j+1;i<elements.length;i++) {
  				//System.out.print(j+" "+i+" ");
  				//System.out.println(elements[j]+"--"+elements[i]);
  				//int[] n2=Arrays.copyOfRange(elements, j, i);
  				//System.out.println(Arrays.toString(n2));
  				int curDiff = Math.abs(elements[j]-elements[i]);
  				if(curDiff>maximumDifference)
  					maximumDifference=curDiff;
  			}			
  		}
  	}
  	

} // End of Difference class

public class Day14Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}