class Solution {
public:
    int minCostClimbingStairs(vector<int>& cost) {
         if (cost.size() == 2) return min(cost[0], cost[1]);
        int n = cost.size();
        vector<int> dp(n + 1);
      int  prev2=cost[0];
        int prev1=cost[1];
        int cur;
        for(int  i = 2;i<n;i++){
            cur=cost[i]+min(prev1,prev2);
            prev2 = prev1;
        prev1 = cur;
        }
        
        return min(prev2,prev1);
    }
};