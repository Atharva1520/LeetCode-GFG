class Solution {
    public void moveZeroes(int[] nums) {
       int n = nums.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[j] != 0){
                j++;
            }
            if(i > j && nums[j] == 0 && nums[i] != 0){
                int temp = nums[j];
                nums[j]=nums[i];
                nums[i] = temp;
                
            }
           
        }
    }
}