class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int counter = 1;
        int total=rows*cols;
        int first_row=0;
        int last_col=cols-1;;

        int last_row=rows-1;
        int first_col=0;
        boolean flag=true;
        List<Integer> list = new ArrayList<Integer>();


      do{
            for(int c=first_col; c < cols && counter<=total; c++) {
                //System.out.print(matrix[first_row][c]+" ");
                list.add(matrix[first_row][c]);
                counter++;
            }
            for(int r=first_row+1; r < rows&& counter<=total; r++) {
                //System.out.print(matrix[r][last_col]+" ");
                list.add(matrix[r][last_col]);
                counter++;
            }

            for(int c=last_col-1; c >=0&& counter<=total; c--) {
                //System.out.print(matrix[last_row][c]+" ");
                list.add(matrix[last_row][c]);
                counter++;
            }
            first_row++;
            last_col--;
            last_row--;
            //first_col++;
            if(counter <=rows*cols) {
                flag=true;
            }else {
                flag=false;
            }
        }while(flag); 
        return list;
    }
}
