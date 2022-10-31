class Solution {
     boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(i, j, 0, board, word)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean dfs(int row, int col, int index, char[][] board, String word) {
        if (checkBound(row, col, board) == -1 || 
            visited[row][col] || 
            word.charAt(index) != board[row][col]) {
            return false;
        }
        visited[row][col] = true;
        if (index == word.length() - 1) {
            return true;
        }
       
        if (dfs(row + 1, col, index+1, board, word) ||
            dfs(row, col + 1, index+1, board, word) ||
            dfs(row - 1, col, index+1, board, word) ||
            dfs(row, col - 1, index+1, board, word)) {
                return true;
            }
        
       
        visited[row][col] = false;
        return false;
    }
    
    private int checkBound(int row, int col, char[][] board) {
        if (row == -1 || row == board.length || col == -1 || col == board[0].length) {
            return -1;
        }
        return 0;
    }
}