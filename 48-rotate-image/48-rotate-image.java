class Solution {
    public void rotate(int[][] matrix) {
       int n = matrix.length;
        int temp =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i>=j){
                    temp = matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
         for (int[] b : matrix) {
            for (int i = 0, j = matrix.length - 1; i < matrix.length / 2; i++, j--) {
                temp = b[i];
                b[i] = b[j];
                b[j] = temp;
            }
        }
}
}