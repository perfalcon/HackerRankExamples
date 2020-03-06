import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaPrimalityTest {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger b = new BigInteger(n);
        boolean prime=false;
        if(b.intValue()==1){
                prime=false;
        }        
        else{
            prime = b.isProbablePrime(1)  ;
        }
        if(prime){
            System.out.print("prime");
        }else{
            System.out.print("not prime");
        };



        scanner.close();
    }
}