class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j =0;j<c;j++){
                if(matrix[i][j] == 0){
                   int er = i;
                    int ec = j;
                    for(int k =0;k<r;k++){
                        if(matrix[k][ec] != 0){
                            matrix[k][ec]=100000000 ;
                        }
                    }
                    for(int k =0;k<c;k++){
                        if(matrix[er][k] != 0){
                            matrix[er][k]=100000000 ;
                        }
                    }
            }
        }
    }
        for(int i=0;i<r;i++){
            for(int j =0;j<c;j++){
                if(matrix[i][j] == 100000000){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
