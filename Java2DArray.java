package hackerRank;

public class Java2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int /*
			 * a[][]= { {1,1,1,0,0,0}, {0,1,0,0,0,0}, {1,1,1,0,0,0}, {0,0,0,0,0,0},
			 * {0,0,0,0,0,0}, {0,0,0,0,0,0}, };
			 */
	/*	a[][]= {{1, 1, 1, 0, 0, 0},
				{0, 1, 0, 0, 0, 0},
				{1, 1, 1, 0, 0, 0},
				{0, 0, 2, 4, 4, 0},
				{0, 0, 0, 2, 0, 0},
				{0, 0, 1, 2, 4, 0},
		};
		*/
		/*
		 * a[][]= { {1, 1, 1, 0, 0, 0},
		 * 
		 * {0, 1,0, 0, 0, 0},
		 * 
		 * {1, 1, 1, 0, 0, 0},
		 * 
		 * {0, 9, 2, -4, -4, 0},
		 * 
		 * {0, 0, 0, -2, 0, 0},
		 * 
		 * {0, 0, -1, -2, -4, 0}, };
		 */
		
		a[][]= {
			    { -1, -1, 0, -9, -2, -2},
  
			    { -2, -1, -6, -8, -2, -5},
		  
			    {-1, -1, -1, -2, -3, -4},
		  
			    {-1, -9, -2, -4, -4, -5},
		  
			    {-7, -3, -3, -2, -9, -9},
		  
			    {-1, -3, -1, -2, -4,-5}};
		 
		
		
		int max= Integer.MIN_VALUE;
		int limit=3;		
		for(int r=0;r<=3;r++) {
			for(int c=0;c<=3;c++) {
				System.out.println("==============");
				int newM=printHourGlass(a,r,c,limit);
				if(newM>max )
					max=newM;
			}	
		}
		System.out.println("----Max Sum---"+max);
	}

	private static int printHourGlass(int[][] a, int r, int c, int limit) {
		int sum =0;
		System.out.println("row-->"+r+" col-->"+c);
		for(int i=r;i<r+limit;i++) {
			boolean col_flag=false;
			for(int j=c;j<c+limit;j++) {
				System.out.print(a[i][j]+" ");
				int temp1 =r+1;
				int temp2 = c+1;
				//if(i==r+1) {
					if(temp1 == i && temp2 == j) {
						System.out.println("==="+temp1+","+temp2);
						//System.out.println("==="+i+","+j);
							sum+=a[i][j];
					}	
				//}
				else if(i!=r+1){
					sum+=a[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("---sum-->"+sum);
		
return sum;
	}

}
