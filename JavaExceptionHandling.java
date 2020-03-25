package hackerRank;

import java.util.Scanner;

public class JavaExceptionHandling {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int n = scanner.nextInt();
			int p = scanner.nextInt();
			MyCalculator cal = new MyCalculator();
			System.out.println(cal.power(n, p));
		}catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e);
					//(e.getClass()).toString().replace("class ", "")+": "+e.getMessage());
		}

	}

}
class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
	public long power(int x, int y) throws Exception {		
		if(x<0 || y <0) {
			throw new  Exception("n or p should not be negative."); 
		}
		else if(x==0 && y==0) {
			throw new  Exception("n and p should not be zero.");
		}
		return (long) Math.pow(x,y);
	}
    
}