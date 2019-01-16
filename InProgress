static int[] climbingLeaderboard(int[] scores, int[] alice) {

        List tempList = new ArrayList();
        int[] result = new int[alice.length];
        for(int i=0;i<scores.length;i++){

            tempList.add(scores[i]);
        }
        
        System.out.println(tempList);
        //remove duplicates
        Set<Integer> set = new LinkedHashSet();
        set.addAll(tempList);
        tempList.clear();
        tempList.addAll(set);
        System.out.println(tempList);
        for(int i=0;i<alice.length;i++){
         int rank = Collections.binarySearch(tempList,alice[i],Collections.reverseOrder());
         System.out.println("Rank-->"+rank);
         if(rank > 0){
             rank++;
         }
         result[i]=Math.abs(rank);   
        }
        System.out.print("rank-->"+result);
        return result;


    }
===
worked solution
int results[] = new int[alice.length];
int rank = 1;
int rankScore = scores[0];

for (int a = alice.length - 1, s = 0; a >= 0; a--) {
	if (alice[a] < rankScore) {
		for (; s < scores.length; s++) {
			if (scores[s] < rankScore) {
				rank++;
				rankScore = scores[s];
			}				
			if(alice[a] >= scores[s]) break;
		}
	}

	results[a] = s == scores.length ? rank + 1 : rank;
}

return results;



====
   four test cases failed:
   
    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] results = new int[alice.length];
        List list = new ArrayList();
        for(int i=0; i<scores.length-1;i++){
            int current = scores[i];
            if(current !=scores[i+1]){
                list.add(current);
            }
        }
        list.add(scores[scores.length-1]);
        int[] temp_scores = new int[list.size()];
        for(int i=0;i<list.size();i++){
            System.out.println("numbers -->"+list.get(i));
            temp_scores[i]=(int)list.get(i);
        }
        for(int i=0;i<temp_scores.length;i++){
        System.out.println("temp_scores -->"+temp_scores[i]);
        }

        boolean matched =false;
        for(int j=0;j<alice.length;j++){
            matched=false;
            for(int i =temp_scores.length-1;i>=0;i--){
                System.out.println("Comparing -->j->"+j+" "+alice[j]+"==="+temp_scores[i]+" "+i);
                if(alice[j]<=temp_scores[i]) {
                    if(alice[j]==temp_scores[i]){
                        results[j]=i+1;
                    }else{
                        results[j]=i+1+1;
                    }                    
                    matched=true;
                    System.out.println("i-->"+i);
                    break;
                }
            }
            System.out.println("match -->"+matched);
            if(!matched){
                    results[j]=1;
                }
            System.out.println("j-->" + results[j]);
        }
        for(int k=0; k<results.length;k++){
                System.out.print(" " + results[k]);
        }


        return results;
===

---
