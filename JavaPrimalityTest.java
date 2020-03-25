package hackerRank;

import java.math.BigInteger;

public class JavaPrimalityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger b = new BigInteger("1");
		
		if(b.intValue()==1)
			System.out.println(b.intValue());
		
			
		System.out.println(b.isProbablePrime(1));
		
		
		BigInteger a = new BigInteger("1234");
		 b = new BigInteger("20");
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));

	}

}
