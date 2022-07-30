class Solution {
    public int lengthOfLIS(int[] nums) {
     int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        int dp[]=new int[n];
        int hash[]=new int[n];
        for(int i=0;i<n;i++){
            hash[i]=i;
            for(int j = 0;j<i;j++){
                if(nums[i] > nums[j] && 1 + dp[j] > dp[i]){
                    dp[i] = 1 + dp[j];
                    hash[i]=j;
                }
            }
            if(dp[i] > maxi){
                maxi = dp[i];
                
            }
        }
        return 1 + maxi;
    }
}