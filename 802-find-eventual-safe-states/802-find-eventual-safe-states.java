class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
    int len = graph.length;
    boolean[] visited = new boolean[len];
    boolean[] dfsVisited = new boolean[len];
    boolean[] isCycle = new boolean[len];
    
    List<Integer> result = new ArrayList<>();
    
    for(int i = 0; i<len; i++){
        if(!visited[i]){
            detectCycle(i,visited,dfsVisited,graph,isCycle);       
        }
    }
                                                   
    for(int i = 0;i < len;i++){
        if(!isCycle[i]){
            result.add(i);
        }
    }
    return result;
}

boolean detectCycle(int i,boolean[] visited,boolean[] dfsVisited,int[][] graph,boolean[] isCycle){
    visited[i] = true;
    dfsVisited[i] = true;
    
    for(int e : graph[i]){
        if(!visited[e]){
            if(detectCycle(e,visited,dfsVisited,graph,isCycle)){
                isCycle[i] = true;
                return true;
            }
        }
        else if(visited[e] && dfsVisited[e]){
            isCycle[i] = true;
            return true;
        }
    }
    dfsVisited[i] = false;
    
    return false;
}
}
