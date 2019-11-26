package hackerRank;

import java.util.Scanner;

public class JavaDatatypes {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
//		System.out.println(-(long)Math.pow(2, 63));
//		System.out.println((long)Math.pow(2, 63));
		
		for(int i=0;i<t;i++)
		{
			try
			{
				long x=sc.nextLong();
				System.out.println(x+" can be fitted in:");
				if(x>=-128 && x<=127)System.out.println("* byte");
				if(x>=-32768 && x<=32767)System.out.println("* short");
				if(x>=-2147483648 && x<=2147483647) System.out.println("* int");
				if(x>=-9223372036854775808l && x<=9223372036854775807l)System.out.println("* long");
				
				//Complete the code
			}
			catch(Exception e)
			{
				System.out.println(sc.next()+" can't be fitted anywhere.");
			}

		}

	}

}


/*7

9223372036854775808

9223372036854775807

-9223372036854775808

-9223372036854775807

4294967296

4294967295

-4294967296

-4294967295

65536

65535

-65536

-65535

256

255

-256

-255

12222222222222222222222222222222222222222221
*/