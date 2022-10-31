class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
               if(board[i][j] == word.charAt(0) && dfs(i,j,0,board,word)){
                   return true;
               }
            }
        }
        return false;
    }
    boolean dfs(int i,int j,int ind,char[][] board,String word){
        if(ind == word.length())return true;
        if(i <0 || j <0 || i == board.length || j == board[0].length || board[i][j] != word.charAt(ind)){
            return false;
        }
        char cur = board[i][j];
        board[i][j]='-';
        boolean found = dfs(i+1,j,ind+1,board,word)||
                        dfs(i-1,j,ind+1,board,word)||
                        dfs(i,j+1,ind+1,board,word)||
                        dfs(i,j-1,ind+1,board,word);
        board[i][j]= cur;
        return found;
    }
}