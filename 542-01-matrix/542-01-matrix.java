class Solution {
   class Pair{
        int i, j, dist;
        public Pair(int i, int j, int dist){
            this.i = i;
            this.j = j;
            this.dist = dist;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        boolean[][] visited = new boolean[n][m];
        int[][] dist = new int[n][m];
        Queue<Pair> q = new LinkedList<>();
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(mat[i][j] == 0){
                    q.offer(new Pair(i, j, 0));
                    visited[i][j] = true;
                }
            }
        }
        int[] row = {-1, 0, +1, 0};
        int[] col = {0, +1, 0, -1};
        while(!q.isEmpty()){
            Pair front = q.poll();
            dist[front.i][front.j] = front.dist;
            for(int ind = 0; ind<4; ind++){
                int xx = front.i+ row[ind];
                int yy = front.j+ col[ind];
                if(xx>=0 && yy>=0 && xx<n && yy<m && !visited[xx][yy]){
                    q.offer(new Pair(xx, yy, front.dist +1));
                    visited[xx][yy] = true;
                }
            }
        }
        return dist;
    }
}