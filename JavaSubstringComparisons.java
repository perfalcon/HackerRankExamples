import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        java.util.ArrayList<String> substr= new java.util.ArrayList<String>();
        for(int i=0;i<s.length()&&(i+k<=s.length());i++) {
        substr.add(String.copyValueOf(java.util.Arrays.copyOfRange(s.toCharArray(), i, i+k)));
        }
        substr.sort(String::compareTo);
        smallest=substr.get(0);
        largest=substr.get(substr.size()-1);

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
