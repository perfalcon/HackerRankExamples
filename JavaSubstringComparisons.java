package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class JavaSubstringComparisons {
	
	public static void main(String args[]) {
		String s="welcometojava";
		ArrayList<String> substr= new ArrayList<String>();
		
		
		/*
		 * for(int j=0;j<s.length();j++) { for(int i=j+1;i<=s.length();i++) {
		 * //System.out.print(n[j]+""+n[i]+" "); char
		 * n2[]=Arrays.copyOfRange(s.toCharArray(), j, i);
		 * System.out.println(Arrays.toString(n2)); } //System.out.println(); };
		 */		 
		int m=3;//Length of substring
		
		for(int i=0;i<s.length()&&(i+m<=s.length());i++) {                     
            char n2[]=Arrays.copyOfRange(s.toCharArray(), i, i+m);
             System.out.println(Arrays.toString(n2));
             //substr.add(Arrays.toString(n2));
             substr.add(String.copyValueOf(n2));
        }
		
		System.out.println(substr);
		substr.sort(String::compareTo);
		System.out.println(substr);
		/*
		 * Iterator<String> iter=substr.iterator(); while(iter.hasNext()) {
		 * System.out.println(iter.next()); }
		 */
		
		System.out.println(substr.get(0));
		System.out.println(substr.get(substr.size()-1));
		
		
		
		
	}

}
