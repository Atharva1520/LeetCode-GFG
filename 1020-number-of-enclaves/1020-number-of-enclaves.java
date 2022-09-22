class Solution {
   static int[][] dirN = {{-1,0},{0,1},{1,0},{0,-1}};
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for(int j=0;j<m;j++){
            if(grid[0][j] == 1){
                dfs(grid,0,j);
            }
            if(grid[n-1][j] == 1){
                dfs(grid,n-1,j);
            }
        }
        for(int i=0;i<n;i++){
            if(grid[i][0] == 1){
                dfs(grid,i,0);
            }
            if(grid[i][m-1] == 1){
                dfs(grid,i,m-1);
            }
        }
        
        int ans = 0;
        for(int i=0;i<=grid.length-1;i++){
            for(int j=0;j<=grid[0].length-1;j++){
                if(grid[i][j] == 1){
                  ans++;
                }
            }
        }
        return ans;
    }
    public void dfs(int[][] grid,int i,int j){
        grid[i][j] = 0;
        for(int[] dir : dirN){
            int r = i+dir[0];
            int c = j+dir[1];
            if(r>=0 && c >=0 && r < grid.length && c <  grid[0].length && grid[r][c] ==1){
                dfs(grid,r,c);
            }
        }
    }
}