class Solution {
public:
    int splitArray(vector<int>& nums, int m) {
         int n = nums.size();
        vector<vector<int>>dp(n+1, vector<int>(m+1, INT_MAX));
        dp[0][0] = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=m; j++){
                int cur = 0;
                for(int k = i; k > 0; k--){
                    cur += nums[k-1];
                    dp[i][j] = min(dp[i][j], max(cur, dp[k-1][j-1]));
                }
            }
        }
        return dp[n][m];
    }
};