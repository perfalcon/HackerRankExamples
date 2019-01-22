 // InProgress
 //Learned - factors
 //       - How to find a number from the given factors.
 
 /*
     * Complete the getTotalX function below.
     */
    static int getTotalX(int[] a, int[] b) {
        /*
         * Write your code here.
         */

         int results=0;
         int n=a.length;
         int m=b.length;
         int size=0;
         for(int i=n-1;i>0;i--){
            size = size + i;
         }
         System.out.println("Size--->"+size);
         int[] numbers=new int[size+1];
         System.out.println("numbers-->"+numbers.length);
         int x=0;
         for(int i=0;i<n; i++){
             for(int j =i+1;j<n;j++){
                 System.out.println("i-->"+i+"j-->"+j);
                 numbers[x++]=a[i]*a[j];                 
             }
         }
         numbers[numbers.length-1]=a[n-1];
         System.out.println(" ");
         for(int i=0;i<numbers.length;i++){
             System.out.print(" "+numbers[i]);
         }
         return results;

    }
