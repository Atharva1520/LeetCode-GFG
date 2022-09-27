class Solution {
    public boolean canFinish(int N, int[][] pre) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<N;i++){
            adj.add(new ArrayList<>());
        }
        int m = pre.length;
        for(int i=0;i<m;i++){
           adj.get(pre[i][1]).add(pre[i][0]);
            
        }
       
        int indeg[] = new int[N];
        for(int i=0;i<N;i++){
            for(int it : adj.get(i)){
                indeg[it]++;
            }
            
        }
         Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<N;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
       
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            ans.add(node);
            
            for(int it:adj.get(node)){
                indeg[it]--;
                if(indeg[it]==0){
                    q.add(it);
                }
            }
        }
        if(ans.size() == N){
            return true;
        }
        return false;
    }
}