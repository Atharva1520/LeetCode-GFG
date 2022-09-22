class Solution {
    public void solve(char[][] board) {
        int dr[] = {-1,0,1,0};
        int dc[]={0,1,0,-1};
        int n = board.length;
        int m = board[0].length;
        int vis[][]=new int[n][m];
        for(int i=0;i<m;i++){
            if(board[0][i] == 'O' && vis[0][i] == 0){
                dfs(0,i,vis,board,dr,dc);
            }
            if(board[n-1][i] == 'O' && vis[n-1][i] == 0){
                dfs(n-1,i,vis,board,dr,dc);
            }
            
        }
         for(int i=0;i<n;i++){
            if(board[i][0] == 'O' && vis[i][0] == 0){
                dfs(i,0,vis,board,dr,dc);
            }
            if(board[i][m-1] == 'O' && vis[i][m-1] == 0){
                dfs(i,m-1,vis,board,dr,dc);
            }
            
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j] == 'O' && vis[i][j]==0){
                    board[i][j]='X';
                }
            }
        }
        
    }
    static void dfs(int r,int c,int[][] vis,char[][] board,int[] dr,int[]dc){
        vis[r][c]=1;
        int n = board.length;
        int m = board[0].length;
        for(int i=0;i<4;i++){
          int  nr = r + dr[i];
           int nc=c+dc[i];
            if(nr >=0 && nr < n && nc>=0 && nc<m && vis[nr][nc] == 0 && board[nr][nc]=='O'){
                dfs(nr,nc,vis,board,dr,dc);
            }
        }
    }
}