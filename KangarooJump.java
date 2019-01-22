
  // Complete the kangaroo function below.
  static String kangaroo(int x1, int v1, int x2, int v2) {
             String result="NO";
        if((x1<x2) && (v1<v2))
        result ="NO";
        else
        {        
        if((v1!=v2) && ((x2-x1)%(v1-v2))==0)
            result ="YES";
        else
            result ="NO";

        }

        System.out.println(result);
        return result;
    }
