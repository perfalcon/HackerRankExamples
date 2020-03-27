package hackerRank.thirtyDays;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day16ExceptionsStringToInt {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        try {
        	int x = Integer.parseInt(S);
        }
        catch(NumberFormatException e) {
        	System.out.println(e);
        }
    }
}