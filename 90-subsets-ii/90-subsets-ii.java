class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        f(0,nums,new ArrayList<>(),set);
        ans.addAll(set);
        return ans;
        
    }
    public void f(int ind,int[] nums,List<Integer>ds,HashSet<List<Integer>> set){
        if(ind == nums.length){
            set.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[ind]);
        f(ind+1,nums,ds,set);
        
        ds.remove(ds.size()-1);
        f(ind +1,nums,ds,set);
        
    }
}