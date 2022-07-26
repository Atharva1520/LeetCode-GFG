class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
for(int i=0;i<nums.length;i++){
//On each iteration just add the value at that particular index to it.
sum=sum+nums[i];
nums[i] = sum;
}
return nums;
    }
}