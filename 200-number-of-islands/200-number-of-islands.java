class Solution {
public int numIslands(char[][] grid) {
int m = grid.length;
int n = grid[0].length;

 boolean[][] visited = new boolean[m][n];
 
 int count = 0;
    
 for(int i = 0;i<m;i++)
 {
     for(int j=0;j<n;j++)
     {
         if(grid[i][j] == '1' && !visited[i][j])
         {
             solve(grid,i,j,visited);
             count++;
         }
     }
 }
    return count;
}

private void solve(char[][] grid,int i,int j,boolean[][] visited)
{
    if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || visited[i][j] == true || grid[i][j] == '0') return;
  
    visited[i][j] = true;

    solve(grid,i+1,j,visited);
    solve(grid,i-1,j,visited);
    solve(grid,i,j+1,visited);
    solve(grid,i,j-1,visited);
}
}
