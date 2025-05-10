/*
Write a program to print all combination of the given String. 
Examples :
String (Input) : ABC, Combinations (Output): ABC, BCA, CAB, CBA, BAC, ACB
String (Input) : ABCD, Combinations (Output) : ABCD ABDC ACBD ACDB ADBC ADCB BACD BADC BCAD BCDA BDAC BDCA CABD CADB CBAD CBDA CDAB CDBA DABC DACB DBAC DBCA DCAB DCBA
*/


public class StringPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "ABCD";
        System.out.println("Combinations (Output):");
        generatePermutations(input, "");
	}
	 private static void generatePermutations(String str, String prefix) {
	        if (str.length() == 0) {
	            System.out.print(prefix + " ");
	            return;
	        }

	        for (int i = 0; i < str.length(); i++) {
	            char currentChar = str.charAt(i);
	            String remainingChars = str.substring(0, i) + str.substring(i + 1);
	            generatePermutations(remainingChars, prefix + currentChar);
	        }
	    }
}
