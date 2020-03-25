package hackerRank;


import java.io.*;
import java.math.BigInteger;
import java.util.*;
interface PerformOperation {
 boolean check(int a);
}
class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }

public PerformOperation isOdd() {
	PerformOperation odd = a->(a%2!=0)?true:false;
	return odd;
}

public PerformOperation isPrime() {
	PerformOperation prime = a->
		(new java.math.BigInteger(String.valueOf(a))).isProbablePrime(1)?true:false;		
	return prime;
}

public PerformOperation isPalindrome() {
	PerformOperation palindrome = a->String.valueOf(a).equals((new StringBuilder(String.valueOf(a))).reverse().toString())?true:false;
	return palindrome;
}

   // Write your code here
}

public class JavaLambdaExp {

 public static void main(String[] args) throws IOException {
  MyMath ob = new MyMath();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.isOdd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.isPrime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}
