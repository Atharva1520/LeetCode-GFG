class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        f(ans,new ArrayList<>(),n , k,1);
        return ans;
        
    }
    static void f(List<List<Integer>> ans,List<Integer> cur,int n,int k,int start){
        if(k==0){
            ans.add(new ArrayList<>(cur));
        }
        for(int i=start;i<=n;i++){
            cur.add(i);
            f(ans,cur,n,k-1,i+1);
            cur.remove(cur.size() - 1);
        }
    }
}