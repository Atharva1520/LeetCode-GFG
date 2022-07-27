class Solution {
public:
    int maxProfit(vector<int>& v) {
        int n = v.size();
        vector<int> pre(2);
        for(int i = n - 1; i >= 0; --i) {
            for(int j = 0; j < 2; ++j) {
                int profit;
                if(j)
                    profit = max(v[i] + pre[0], pre[1]);
                else
                    profit = max(pre[0], -v[i] + pre[1]);
                pre[j] = profit;
            }
        }
        return pre[0];
    }
};