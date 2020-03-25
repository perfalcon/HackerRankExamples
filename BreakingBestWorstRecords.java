package hackerRank;

public class BreakingBestWorstRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scores={3,4,21,36,10,28,35,5,24,42};
		int min=scores[0];
		int max=scores[0];
		int minScore=0;
		int maxScore=0;
		
		for(int i:scores){
			if(i<min){
				minScore++;
				min=i;
			}
			if(i>max){
				maxScore++;
				max=i;
			}
		}
		int results[] ={maxScore,minScore}; 
				//new int[2];
        //results[0]=maxScore;
        //results[1]=maxScore;
		System.out.println("Max Score-->"+maxScore+"---"+results[0]);
		System.out.println("Min Score-->"+minScore+"---"+results[1]);
	}

}
