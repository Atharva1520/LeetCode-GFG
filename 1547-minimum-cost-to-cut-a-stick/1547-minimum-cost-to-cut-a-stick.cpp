class Solution {
public:
    int minCost(int len, vector<int>& cuts) {
        int n=cuts.size();
        cuts.push_back(len);
        cuts.insert(cuts.begin(),0);
        sort(cuts.begin(),cuts.end());
        vector<vector<int>>dp(n+2,vector<int>(n+2,0));
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n;j++){
                if(i>j)continue;
                int mini=1e7;
                for(int idx=i;idx<=j;idx++){
                    int cost=cuts[j+1]-cuts[i-1]+dp[i][idx-1]+dp[idx+1][j];
                    mini=min(mini,cost);
                }
                dp[i][j]=mini;
            }
        }
        
        return dp[1][n];
    }
};