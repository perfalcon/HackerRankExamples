package hackerRank;

import java.math.BigInteger;

public class ExtraLongFactorials {

	public static void main(String[] args) {
		//int x = 10;		
		//int[] num={5,10,15,20,25};		
		/*for(int x=5;x<50;x=x+5){
			BigInteger result=factorial(x);
			System.out.println("Factorial of ("+x+")-->"+result);	
		}		*/
		for(int x=5;x<100;x=x+5){
			BigInteger result = new BigInteger("1");	
			for(int i=2;i<=x;i++){
				result=result.multiply(BigInteger.valueOf(i));	
			}			
			System.out.println("Factorial of ("+x+")-->"+result);
		}
		for(int x=5;x<100;x=x+5){
		int N = 20;
		N=x;
        System.out.println(factorial(N));
		}
	}

	/*private static long factorial(BigInteger x) {
		if(x > 1)
			return x*factorial(x-1);
		return x;		
	}*/
	 static BigInteger factorial(int N) 
	    { 
	        // Initialize result 
	        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE 
	  
	        // Multiply f with 2, 3, ...N 
	        for (int i = 2; i <= N; i++) 
	            f = f.multiply(BigInteger.valueOf(i)); 
	  
	        return f; 
	    } 
	
	
}
