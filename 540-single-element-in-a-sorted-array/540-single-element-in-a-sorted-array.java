class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int ele=0;
        for(int i=0;i<n;i++){
            ele = nums[i] ^ ele;
        }
        return ele;
    }
}