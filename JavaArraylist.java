package hackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		
		
		ArrayList <ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<n;i++) {
			String nums[] = in.nextLine().split("\\s");
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for(int j =0;j<nums.length;j++) {
				
				temp.add(Integer.parseInt(nums[j]));
			}
			a.add(temp);
		}
		
		//in.nextLine();
		
		int q =in.nextInt();
		int qs[][]=new int[q][2];
		for(int i=0; i<q;i++) {
			 qs[i][0]= in.nextInt();
			 qs[i][1]= in.nextInt();
			 //System.out.println(qs[i][0]+"  "+qs[i][1]);
		}
		
		
		//for(ArrayList<Integer>temp : a) {
		/*
		 * for(int i=0;i<a.size();i++) { ArrayList<Integer>temp = a.get(i);
		 * System.out.println("\n=="+temp.size()+"=="+i);
		 * 
		 * for(int x : temp) { System.out.print(x+" "); } System.out.println("");
		 * 
		 * }
		 */
		
		
		  for(int x=0;x<qs.length;x++) { System.out.println(qs[x][0]+","+qs[x][1]);
		  ArrayList<Integer>temp = a.get(qs[x][0]-1); if(temp.size()>qs[x][1]){
		  System.out.println("Found -->"+temp.get(qs[x][1])); }else {
		  System.out.println("ERROR!"); } }
		 
	}

}
