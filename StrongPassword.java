import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StrongPassword {

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String pass) {
        // Return the minimum number of characters to make the password strong

        int count=0;        
        if(pass.matches(".*[A-Z]+.*")){
            //System.out.println("found number/s");
        }else{
            ++count;
        }
        if(pass.matches(".*[0-9]+.*")){

        }else{
           ++count;
        }
        if(pass.matches(".*[a-z]+.*")){

        }else{
           ++count;
        }
        if(pass.matches(".*[\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\-\\+]+.*")){

        }else{
           ++count;
        }

        if((count+n)<6){
         int temp = 6-(count+pass.length());
            count = count+temp;
        }





        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
