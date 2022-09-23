class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=0;
        int h = nums.length-2;
        while(l<=h){
            int m = l + (h-l)/2;
            if(nums[m] == nums[m^1]){
                l = m+1;
            }else{
                h = m-1;
            }
        }
        return nums[l];
    }
}