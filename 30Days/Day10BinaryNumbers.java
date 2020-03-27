package hackerRank.thirtyDays;

import java.util.Arrays;

public class Day10BinaryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n =439;
		/*
		 * int last=0; int ct=0; boolean flag=false; int r=0; while(n>0) { r = n%2;
		 * n=n/2; System.out.println(r+" "); if(last ==1 && r ==1) { if(!flag) { ct++;
		 * flag=true; } }else { flag=false; } last=r; } if(r==1) ct++;
		 * System.out.println("==="+ct);
		 */
		
		// 111 0 11 0 11'
		
		
		
		 
			
		String bin[] =Integer.toBinaryString(n).split("[0]+");
		
		Arrays.sort(bin);
        
		System.out.println(Arrays.toString(bin));
        System.out.println(bin[bin.length-1].length());
		
	}

}
