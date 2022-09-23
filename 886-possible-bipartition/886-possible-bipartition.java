class Solution {
   public boolean possibleBipartition(int n, int[][] dislikes) {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>()); //adjacency list
        }
        for(int[] x: dislikes){
            adj.get(x[0]).add(x[1]);
            adj.get(x[1]).add(x[0]); // caz it is undirected
        }
        int[] color = new int[n+1];
        Arrays.fill(color,-1);
        
        for(int i=1;i<=n;i++){
            if(color[i]==-1){
                if(!solve(color,adj,n,i)) //bfs call
                    return false;
            }
        }
       return true;
        
    }
    public boolean solve(int[] color ,ArrayList<ArrayList<Integer>> adj,int n ,int i){
        Queue<Integer> q = new LinkedList<>();
        q.offer(i);
        color[i] =1;
        while(q.isEmpty()==false){
            int temp = q.poll();
            
            for(int it : adj.get(temp)){
                if(color[it]==-1){             //if this node hasnt been visited yet.
                    color[it] = 1-color[temp];
                    q.offer(it);
                }else if(color[it] == color[temp]) //if it is visited and color of parent and child is same then return fasle
                    return false;
            }
        }
        return true; //else there is no cycle , so we can divide the nodes in two groups.
    } 
}