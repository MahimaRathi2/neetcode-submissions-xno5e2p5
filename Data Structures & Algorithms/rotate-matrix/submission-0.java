class Solution {
    public void rotate(int[][] matrix) {
        //transpose
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){
                int temp;
                temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;

            }
        }
        for(int i=0;i<matrix.length;i++){
            int st=0;
            int end=matrix.length-1;
            while(st<end){
                int temp;
                temp =matrix[i][st] ;
                matrix[i][st] = matrix[i][end];
                matrix[i][end] = temp;
                st++;
                end--;
            }
        }
    }
}
