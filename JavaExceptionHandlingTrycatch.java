package hackerRank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingTrycatch {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			System.out.println(x/y);
			
		}catch(InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		}catch(ArithmeticException e) {
			System.out.println("java.lang.ArithmeticException: / by zero");
		}
		
		
	}

}
