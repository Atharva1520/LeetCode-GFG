class Solution {
    public int singleNumber(int[] nums) {
         Arrays.sort(nums);

        if (nums.length == 1) return nums[0];
        
        if (nums[0] != nums[1]) return nums[0];

        if (nums[nums.length - 2] != nums[nums.length - 1]) return nums[nums.length - 1];

       
        for (int i = 1; i < nums.length;) {
            if (nums[i] == nums[i - 1]) {
                i+=3;
            } else {
                return nums[i-1];
            }
        }
        
         
        return 0; 
    }
}