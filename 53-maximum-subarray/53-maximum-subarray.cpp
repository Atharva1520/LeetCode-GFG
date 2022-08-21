class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int ans = INT_MIN;
        int n = nums.size();
        int cursum =0;
        for(int i=0;i<n;i++){
            cursum = max(nums[i],cursum + nums[i]);
            ans = max(ans,cursum);
        }
        return ans;
    }
};