package hackerRank;
import java.util.Scanner;

public class JavaOutputFormatting {

	/*Output Format

	In each line of output there should be two columns:
	The first column contains the String and is left justified using exactly
	characters.
	The second column contains the integer, expressed in exactly digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
	
	Explanation

	Each String is left-justified with trailing whitespace through the first
	characters. The leading digit of the integer is the character, and each integer that was less than digits now has leading zeroes.
*/	
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.format("%-14s %03d%n",s1,x);
        }
        System.out.println("================================");

	}

}
