import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class DayoftheProgrammer {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {

boolean leapYear = false;
        if(year>=1700 && year<=2700) {
            if(year <1919) {
                if(year % 4 ==0) {
                    leapYear = true;
                }
            }
            if(year>=1919) {
                if(year%400==0 ||(year%4==0&&year%100!=0)) {
                        leapYear=true;
                }
            }    
        }
        int days=leapYear?244:243;
        int day = 256-days;
        
        return day+"."+"09"+"."+year;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
