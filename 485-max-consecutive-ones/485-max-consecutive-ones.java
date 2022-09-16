class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max1 =0;
        int curmax =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1) {
                curmax++;
                max1 = Math.max(max1,curmax);
            }else{
                curmax =0;
            } 
        }
        return max1;
    }
}