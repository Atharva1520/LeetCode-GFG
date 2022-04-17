class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        int mi =ans;
        int ma = ans; //if any negative comes on first
        int n = nums.length;
        for(int i=1 ;i < n ;i ++){
            if(nums[i] < 0){
                int temp = mi;
                mi = ma;
                ma = temp;
            }
            ma = Math.max(nums[i],ma*nums[i]);
            mi = Math.min(nums[i],mi*nums[i]);
            ans = Math.max(ans,ma); // already swapped if anything happen
        }
        return ans;
    }
}