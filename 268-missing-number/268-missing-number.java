class Solution {
    public int missingNumber(int[] nums) {
       
    int len = nums.length;
        int sum = len * (len + 1) / 2;
        for (int i :nums){
            sum -= i;
        }
    
    return sum;
    }
}