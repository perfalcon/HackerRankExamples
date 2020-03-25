package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class JavaSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}

		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}


		int count=0;
		for(int j=0;j<a.length;j++) {
			for(int i=j+1;i<=a.length;i++) {
				System.out.print(j+" "+i+" ");
				int[] n2=Arrays.copyOfRange(a, j, i);
				System.out.println(Arrays.toString(n2));	
				int sum = getSum(n2);
				if(sum<0) {
					count++;
				}
			}			
		}
		System.out.println("count-->"+count);
	}

	private static int getSum(int[] n2) {

		int sum=0;
		for(int i=0;i<n2.length;i++) {
			sum+=n2[i];
		}

		return sum;
	}

}
