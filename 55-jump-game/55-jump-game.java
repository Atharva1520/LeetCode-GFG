class Solution {
    public boolean canJump(int[] nums) {
        int steps = nums[0];
        for(int i=1;i<nums.length;i++){
            steps -= 1;
            if(steps < 0){
                return false;
            }
            steps = Math.max(steps,nums[i]);
        }
        return true;
    }
}