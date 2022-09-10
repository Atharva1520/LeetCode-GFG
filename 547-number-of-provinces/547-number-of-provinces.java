class Solution {
  public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);
        int count =0 ;
        for(int src=0; src<n; ++src){
            if(!visited[src]){
                DFS(isConnected, src, visited);
                ++count;
            }
         }
        
        return count;
        
    }
    
    public void DFS(int[][] graph, int src, boolean[] visited){
        visited[src] = true;
        for(int dest=0; dest<graph[src].length; ++dest){
            if(!visited[dest] && graph[src][dest] == 1)
                DFS(graph, dest, visited);
        }
    }
}