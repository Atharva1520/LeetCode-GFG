class Solution {
    class Pair{
        int i;
        int j;
        int t;
        public Pair(int i, int j, int t){
            this.i = i;
            this.j = j;
            this.t = t;
        }
    }
    public int orangesRotting(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        Queue<Pair> q = new LinkedList<>();
        for(int i = 0; i<n; i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == 2)
                    q.offer(new Pair(i, j, 0));
                else if(grid[i][j] == 1){
                    count++;
                }
            }
        }
        
        int time = 0;
        int[] rowAdd = {-1, 0, +1, 0};
        int[] colAdd = {0, +1, 0, -1};
        int cou = 0;
        while(!q.isEmpty()){
            Pair p = q.poll();
            int i = p.i;
            int j = p.j;
            int tt = p.t;
            time = Math.max(time, tt);
            for(int ii = 0; ii<4; ii++){
                int rr = rowAdd[ii]+ i;
                int cc = colAdd[ii]+ j;
                if(rr>=0 && rr<=n-1 && cc>=0 && cc<= m-1 && grid[rr][cc] == 1){
                    q.offer(new Pair(rr, cc, tt+1));
                    grid[rr][cc] = 2;
                    cou++;
                }
            }
        }
        if(cou != count)
            return -1;
        return time;
    }
}