class Solution {
   public int numEnclaves(int[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (i == 0 || j == 0 || i == grid.length - 1 || j == grid[i].length - 1) {
					if (grid[i][j] == 1)
						bfs(i, j, grid);
				}
			}
		}
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1)
					count++;
			}
		}
		return count;

	}

	public static void bfs(int ni, int nj, int[][] grid) {
		int[][] dirs = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { ni, nj });
		boolean[][] visited = new boolean[grid.length][grid[0].length];
		while (!q.isEmpty()) {
			int[] r = q.poll();
			grid[r[0]][r[1]] = 0;
			if (visited[r[0]][r[1]])
				continue;
			visited[r[0]][r[1]] = true;
			for (int d = 0; d < 4; d++) {
				int i = r[0] + dirs[d][0];
				int j = r[1] + dirs[d][1];
				if (i >= 0 && j >= 0 && i < grid.length && j < grid[0].length && grid[i][j] == 1 && !visited[i][j]) {
					q.add(new int[] { i, j });
				}
			}
		}
	}
}