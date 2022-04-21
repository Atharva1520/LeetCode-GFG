class Solution {
    public int searchInsert(int[] nums, int target) {
        int mid = 0, i = 0, j = nums.length - 1;
        while (i <= j) {
     mid = i + (j - i) / 2;
    if (nums[mid] == target) return mid;
      if (target < nums[mid]) j = mid - 1;
        else i = mid + 1;
    }
        if(nums[mid]>target){
          return mid;
          }
          return mid+1;
              }
          }