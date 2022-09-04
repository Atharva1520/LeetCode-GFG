class Solution {
    public int findMin(int[] nums) {
         int start = 0;
    int end = nums.length - 1;
    
    while(start < end)
    {
        int mid = (start + end) >> 1;
        if(nums[mid] > nums[end])
        {
            start = mid + 1;
        }
        //Handles for duplicate condition
        if(nums[mid] == nums[end])
        {
            end--;
        }
        else if(nums[mid] < nums[end])
        {
            end = mid;
        }
    }
    
    return nums[start];
    
}
    
}