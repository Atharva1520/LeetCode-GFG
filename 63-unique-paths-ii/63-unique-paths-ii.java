class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        
        if( obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1 )
            return 0;
        
        int[] prev = new int[n];
        int[] curr = new int[n];
        
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if( obstacleGrid[i][j] == 1 ) {
                    curr[j] = 0;
                }
                else if( i == 0 && j == 0 ) {
                    curr[j] = 1;
                }
                else {
                    int up = i == 0 ? 0 : prev[j];
                    int left = j == 0 ? 0 : curr[j-1];

                    curr[j] = up + left;
                }
            }
            prev = curr;
        }
            
        return prev[n-1];
    }
}