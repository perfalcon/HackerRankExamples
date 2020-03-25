package hackerRank;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

	public static void main(String[] args) {

		/*
		 * String regex[]= { "([A-Z])(.+)\r\n" , "[AZ[a-z](a-z)\r\n", "batcatpat(nat" };
		 * for(int i=0;i<regex.length;i++) { try { Pattern pattern =
		 * Pattern.compile(regex[i]); System.out.println("Valid");
		 * }catch(PatternSyntaxException pe) { System.out.println("Invalid"); } }
		 */
		
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		int counter=0;
		while(testCases>0 && counter++<testCases){
			String regex = in.nextLine();
          	//Write your code
              try {
                Pattern pattern = Pattern.compile(regex);
                System.out.println("Valid");
            }catch(PatternSyntaxException pe) {
                System.out.println("Invalid");
            }
              
		}
		
		
	}
}
