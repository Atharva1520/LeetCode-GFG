class Solution {
    public int removeElement(int[] nums, int val) {
         /*int index = 0;
        int result[] = Arrays.copyOf(nums, nums.length);
        for (int i = 0; i < result.length; i++) {
            if (result[i] != val) {
                nums[index] = result[i];
                index++;
            }
        }


        return index;  */
        int length = nums.length;
		int count = 0;
		for (int i = 0; i < length; i++) {
			while (nums[i] == val &&  i != length) {
                if(length == 0) {
					break;
				}
				int temp = nums[nums.length - 1 - count];
				nums[nums.length - 1 - count] = nums[i];
				nums[i] = temp;
				count++;
				length = length - 1;
			}
		}
        return length;
    }
}