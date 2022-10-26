class Solution {
  int nums[];
    public Solution(int[] nums) {
        this.nums = nums;
    }
    
    public int[] reset() {
        return nums;
    }
    
    public int[] shuffle() {
        int ans[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int r = (int) (Math.random() * (i+1));
            ans[i]=ans[r];
            ans[r]=nums[i];
            
        }
        return ans;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */