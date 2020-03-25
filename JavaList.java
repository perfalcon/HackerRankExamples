package hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long n = Long.parseLong(in.nextLine());
		
		
		List <Long> a = new ArrayList<Long>();
		for(int i=0; i<n;i++) {
			//String nums[] = in.nextLine().split("\\s");
			//for(int j =0;j<nums.length;j++) {
			//	a.add(Integer.parseInt(nums[j]));
			//}
			a.add(in.nextLong());
		}
		
		for(long x: a) {
			System.out.print(x+" ");
		}
		//in.nextLine();
		
		int q =in.nextInt();
		for(int i=0;i<q;i++) {
			String op=in.next();
			System.out.println("--Operation-->"+op);
			
			if(op.equals("Insert")) {
				int x=in.nextInt(); long y=in.nextLong();
				System.out.println("=="+x+","+y);				
				if(x>=a.size()) 
				{  
				a.add(y);	
				} else if(x<0) { 
					x=0; 
				}else {
					a.add(x, y);	
				}
				
			}
			if(op.contains("Delete")) {
				int temp = in.nextInt();				
				System.out.println("=="+temp);
				if(temp>=0 && temp<a.size())
					System.out.println("removed-->"+a.remove(temp));
			}
			System.out.println();
			
			 
		}
		
		for(long x: a) {
			System.out.print(x+" ");
		}
		
	}
	
	/*
	 * if(in.next().equals("Insert")) { int x=in.nextInt(); int y=in.nextInt();
	 * if(x<0) { x=0; }else if(x>=a.size()) { x=a.size()-1; } a.set(x, y); }else
	 * if(in.next().equals("Delete")) {
	 * System.out.println("removed-->"+a.remove(in.nextInt())); }
	 */

}
