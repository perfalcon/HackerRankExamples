//https://www.hackerrank.com/challenges/java-bigdecimal/problem

import java.math.BigDecimal;
import java.util.*;
class JavaBigDecimal{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();


        //Write your code here
          //List<BigDecimal> list = Arrays.asList(s); 
         
          List<String> list = new ArrayList<String>();
          for(int i=0;i<n;i++){
              list.add(s[i]);
          }

Comparator<String> valueComparator = new Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {
                BigDecimal a = new BigDecimal(s1);
                BigDecimal b = new BigDecimal(s2);
                return b.compareTo(a);
            }        
        };

            list.sort(valueComparator);
          for(int i=0;i<list.size();i++) {
            s[i]=list.get(i).toString();
        }
        
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
