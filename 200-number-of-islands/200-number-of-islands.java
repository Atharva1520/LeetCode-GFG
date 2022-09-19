class Solution {
    public int numIslands(char[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    q.add(new int[]{i, j});
                    count += sinkIsland(grid, q);
                }
            }
        }
        return count;
    }
    
    public int sinkIsland(char[][] grid, Queue<int[]> q) {
        int m = grid.length;
        int n = grid[0].length;
        while (!q.isEmpty()) {
            int[] curr = q.remove();
            int i = curr[0];
            int j = curr[1];
            if (isValid(i, j, m, n) && grid[i][j] == '1') {
                grid[i][j] = '0';
                q.add(new int[]{i, j + 1});
                q.add(new int[]{i + 1, j});
                q.add(new int[]{i - 1, j});
                q.add(new int[]{i, j - 1});
            }
        }
        return 1;
    }
    
    public boolean isValid(int i, int j, int m, int n) {
        return i >= 0 && i < m && j >= 0 && j < n;
    }
}