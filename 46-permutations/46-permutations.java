class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
       
        fun(0,nums,ans);
        
        return ans;
    }
    public void swap(int a,int b,int[] nums){
        int temp = nums[a];
       nums[a]=nums[b];
        nums[b]=temp;
    }
    public void fun(int ind,int[] nums, List<List<Integer>> ans){
        if(ind == nums.length){
             List<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            res.add(nums[i]);
        }
            ans.add(new ArrayList<>(res));
            return;
        }
       
        for(int i=ind;i<nums.length;i++){
            swap(ind,i,nums);
            fun(ind+1,nums,ans);
            swap(ind,i,nums);
        }
    }
}