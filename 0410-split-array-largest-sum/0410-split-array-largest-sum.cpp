class Solution {
public:
     int dp[1001][51];
    int fun(vector<int>& nums, int ind, int m){
        if(ind == 0 && m == 0) return 0;
        if(ind == 0 || m == 0) return INT_MAX;
        if(dp[ind][m]!=-1) return dp[ind][m];
        int ans = INT_MAX;
        int cur = 0;
        for(int k = ind; k > 0; k--){
            cur += nums[k-1];
            ans = min(ans, max(cur, fun(nums, k-1, m-1)));
        }
        return dp[ind][m] = ans;
    }
public:
    int splitArray(vector<int>& nums, int m) {
        memset(dp, -1, sizeof dp);
        return fun(nums, nums.size(), m);
    }
};