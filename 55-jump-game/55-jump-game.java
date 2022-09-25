class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) return true;

    int biggestJump = nums[0];
    
    for (int i = 1;i < nums.length - 1;i++) {
        if (biggestJump >= i)
            biggestJump = Math.max(biggestJump, i + nums[i]);
        else
            return false;
    }
    
    return biggestJump >= nums.length - 1;
}
    }
