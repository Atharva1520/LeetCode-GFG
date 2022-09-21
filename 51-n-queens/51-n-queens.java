class Solution {
    public List<List<String>> solveNQueens(int n) {
       char[][] board = new char[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                board[i][j]='.';
        List<List<String>> res = new LinkedList<>();
        int lr[]=new int[n];
        int updia[]=new int[2*n-1];
         int ldia[]=new int[2*n-1];
        solve(0, board, res, lr, ldia, updia);
            return res;
    }
    public static void solve(int c,char[][] board,List<List<String>> res,int[] lr,int[] ldia,int[] updia){
        if(c == board.length){
            res.add(Construct(board));
            return;
        }
        int n = board.length;
        for(int r=0;r<board.length;r++){
            if(lr[r]==0 && ldia[r+c] == 0 && updia[n-1+c-r] == 0){
                board[r][c] = 'Q';
                lr[r]=1;
                ldia[r+c]=1;
                updia[n-1+c-r] =1;
                solve(c+1,board,res,lr,ldia,updia);
                 board[r][c] = '.';
                lr[r]=0;
                ldia[r+c]=0;
                updia[n-1+c-r] =0;
                
            }
            
        }
    }
    public static List<String> Construct(char[][] board){
        List < String > res = new LinkedList < String > ();
         for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}