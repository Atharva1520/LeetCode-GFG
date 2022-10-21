class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans  = new ArrayList<>();
        f(ans,new ArrayList<>(),n,k,1);
        return ans;
    }
    static void f(List<List<Integer>> ans,List<Integer> cur,int n,int k,int start){
        if(cur.size() > k)return;
        else if(cur.size() == k && n == 0){
            ans.add(new ArrayList<>(cur));
        }else{
            for(int i = start;i<10;i++){
                cur.add(i);
                f(ans,cur,n-i,k,i+1);
                cur.remove(cur.size() - 1);
            }
        }
    }
}