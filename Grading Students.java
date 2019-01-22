    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */
        int[] results=new int[grades.length];
        for(int i=0; i<grades.length;i++){
            if(grades[i]<38){
                results[i]=grades[i];
                continue;
            }
           int j = grades[i];
            j++;
            while(true){
                if(j % 5 ==0 ){
                    break;
                }else{
                    j++;
                }
            }
            if(j - grades[i] < 3 ){
                results[i]=j;
            }else{
                results[i]=grades[i];
            }
        }
        
        return results;


    }
