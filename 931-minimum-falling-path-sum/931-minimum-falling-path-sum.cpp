class Solution {
public:
    int minFallingPathSum(vector<vector<int>>& matrix) {
         int n=matrix.size();
        vector<vector<int>> dp(n,vector<int> (n,0));
        for(int i=0;i<n;i++){
            dp[0][i]=matrix[0][i];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                int up=INT_MAX,ur=INT_MAX,ul=INT_MAX;
                if(i>0)up=dp[i-1][j];
                if(i>0 && j<n-1)ur=dp[i-1][j+1];
               if(j>0) ul=dp[i-1][j-1];
                dp[i][j]=matrix[i][j]+min(ul,min(up,ur));
            }
        }
        int ans=INT_MAX;
        for(auto i:dp[n-1]){
            ans=min(ans,i);
        }
        return ans;
    }
};