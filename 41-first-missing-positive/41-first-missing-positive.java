class Solution {
    public int firstMissingPositive(int[] nums) {
         int correct_pos = 0;
        int temp = 0;
        
        for(int i=0;i<nums.length;i++) {
            correct_pos = nums[i]-1;
   
            while(nums[i] >=1 && nums[i] < nums.length && nums[i] != nums[correct_pos]){
                temp = nums[i];
                nums[i] = nums[correct_pos];
                nums[correct_pos] = temp;
                correct_pos = nums[i]-1;
            }
        }
        for(int i=0;i<nums.length;i++) {
            if(i+1 != nums[i])
                return i+1;
        }
      return nums.length+1;
    }
}