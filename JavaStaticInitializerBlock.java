package hackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class JavaStaticInitializerBlock {



//Write your code here
static int B;
static int H;
static boolean flag;
static {
    flag=false;
     Scanner scanner = new Scanner(System.in);
     scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
     B = scanner.nextInt();
     H = scanner.nextInt();
     if(B<=0 || H<=0){
         System.out.println("java.lang.Exception: Breadth and height must be positive");
     }else{
         flag=true;
     }
}


public static void main(String[] args){
	
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

