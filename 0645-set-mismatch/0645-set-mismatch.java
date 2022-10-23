class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[] = new int[2];
        int cursum=0;
        int n = nums.length;
        Arrays.sort(nums);
        int sum = (n * (n+1))/2;
       for(int i=0;i<n;i++){
           cursum += nums[i];
       }
        for(int i=1;i<n;i++){
            if(nums[i] == nums[i-1]){
                ans[0]=nums[i];
            }
        }
        cursum -= ans[0];
        ans[1] = sum - cursum;
        return ans;
    }
}