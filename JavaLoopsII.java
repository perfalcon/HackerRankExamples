package hackerRank;
import java.util.*;
public class JavaLoopsII {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            System.out.format("%d, %d, %d", a, b, n);
            System.out.println();
            int sum=0;
            for(int j=0;j<n;j++){            	
            	sum =  sum+b*(int)Math.pow(2,j);
            	System.out.format("%d ",a+sum);            	
            }
            System.out.println();
        }
        in.close();

	}

}
