package hackerRank;


import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.reflect.*;
import static java.lang.System.in;

class Prime{
	void  checkPrime(int ... a) {
		for(int i=0;i<a.length;i++){
			BigInteger b = BigInteger.valueOf(a[i]);
			//System.out.print(a[i]);
			if(b.isProbablePrime(1)) {
				System.out.print(a[i]+" ");
			}
			
		}
		System.out.println();
	}
}

public class JavaPrimeChecker {

	public static void main(String[] args) {
		
		
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);	
		Method[] methods=Prime.class.getDeclaredMethods();
		Set<String> set=new HashSet<>();
		boolean overload=false;
		for(int i=0;i<methods.length;i++)
		{
			if(set.contains(methods[i].getName()))
			{
				overload=true;
				break;
			}
			set.add(methods[i].getName());
			
		}
		if(overload)
		{
			throw new Exception("Overloading not allowed");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}

