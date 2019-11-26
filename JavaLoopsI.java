package hackerRank;
import java.util.*;
public class JavaLoopsI {

	 private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println(N);
        
        for(int i=1; i<=10;i++){
        	System.out.format("%d x %d = %d%n",N,i,N*i);
        }
        
        scanner.close();
    }


}
