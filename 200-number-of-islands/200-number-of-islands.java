class Pair{
int first,second;

Pair(int first,int second)
{
    this.first = first;
    this.second = second;
}
}

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
    visited[i][j] = true;
    
   Queue<Pair> q = new LinkedList<Pair>();

   q.offer(new Pair(i,j));
   
   while(!q.isEmpty())
   {
     int raw = q.peek().first;
     int col = q.peek().second;
     q.poll();
       
       //visiting for 4 directions
       
       int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
       
       for(int[] alldirs : dirs)
       {
               int rawt = raw + alldirs[0];
               int colt = col + alldirs[1];
               
                if(rawt>=0 && rawt < grid.length && colt >=0 && colt < grid[0].length){
                    
                    if(grid[rawt][colt] == '1' && visited[rawt][colt] == false){
                        visited[rawt][colt] = true;
                        q.add(new Pair(rawt,colt));
                    }
                    
                }
           }
      }
  }
}