class Solution {
    public int removeElement(int[] nums, int val) {
         int index = 0;
        int result[] = Arrays.copyOf(nums, nums.length);
        for (int i = 0; i < result.length; i++) {
            if (result[i] != val) {
                nums[index] = result[i];
                index++;
            }
        }


        return index;  
    }
}