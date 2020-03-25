package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class BirthdayChocolate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n =5;
		int s[] = {2,2,1,3,2};
				//new int[n];
		int d=4,m=2;
		int count=0;
		
		List<Integer> S = new ArrayList<Integer>();
		
		for(int i=0;i<n-(m-1);i++) {
			int sum=0;
			for(int j=0;j<m;j++) {
				sum+=s[i+j];
			}
			System.out.println(sum);
			if(sum==d)
				count++;
			
		}
		
		System.out.println("count -->"+count);
		
	}
	static int birthday(List<Integer> s, int d, int m) {
		int count=0;
		List<Integer> S = new ArrayList<Integer>();

		for(int i=0;i<s.size()-(m-1);i++) {
			int sum=0;
			for(int j=0;j<m;j++) {
				sum+=s.get(i+j);
			}
			System.out.println(sum);
			if(sum==d)
				count++;
		}
		return count;
	}

}
