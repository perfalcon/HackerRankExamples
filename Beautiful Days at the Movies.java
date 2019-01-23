//Leanred : How to reverse a number without using string array (aware of this in college days)- 
//though i google'd it find any efficient solution.
//
//

// Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        int result=0;
        for(int x=i;x<=j;x++){
            int reversedNum = 0;
            int input_long = x;
             while (input_long != 0) {
                reversedNum = reversedNum * 10 + input_long % 10;
                input_long = input_long / 10;
                }
              if( Math.abs(reversedNum - x) % k ==0){
                result++;
            }
        }
        return result;

    }
