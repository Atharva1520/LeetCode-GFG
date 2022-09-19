class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        f(0,candidates,new ArrayList<>(),ans,target);
        return ans;
        
    }
    public void f(int ind,int[] nums,List<Integer> ds,List<List<Integer>> ans,int target){
        if(ind == nums.length){
            if(target ==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(target >= nums[ind]){
            //pick
            ds.add(nums[ind]);
            f(ind,nums,ds,ans,target-nums[ind]);
            ds.remove(ds.size()-1);
        }
        //notpick
        f(ind+1,nums,ds,ans,target);
    }
}