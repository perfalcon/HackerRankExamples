package hackerRank.thirtyDays;

public class Day9Recursion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=2;
		
		int result = factorial(n);
		System.out.println(result);
		
	}

	private static int factorial(int n) {
		if(n>1) {
			return n*factorial(n-1);
		}else {
			return 1;
		}
	}

}
