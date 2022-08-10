class Solution {
public:
    int missingNumber(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int sum1 = accumulate(nums.begin(), nums.end(), 0);
        
        int n = nums.size();
        int sum2 = (n * (n+1))/2;
        return sum2 - sum1;
    }
};