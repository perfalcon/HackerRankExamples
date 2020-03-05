import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class JavaBigInteger {
private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String n = scanner.nextLine();
        BigInteger a = new BigInteger(n);

        n = scanner.nextLine();
        BigInteger b = new BigInteger(n);
System.out.println(a.add(b));
        System.out.println(a.multiply(b));
         scanner.close();
    }
}
