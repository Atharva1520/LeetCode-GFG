class Solution {
    public int subsetXORSum(int[] nums) {
        return f(nums,0,0);
    }
    public static int f(int[] nums,int ind,int cur){
        if(ind == nums.length)return cur;
        
        int pick = f(nums,ind+1,nums[ind] ^ cur);
        int notpick = f(nums,ind+1,cur);
        return pick + notpick;
    }
}