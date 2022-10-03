int dp[101][10001];
class Solution {
    int sub(string &s, string &t, int n, int m)
    {
        if(n==0 || m==0)
        {
            return 0;
        }
        
        if(dp[n][m]!=-1)
        {
            return dp[n][m];
        }
        
        if(s[n-1]==t[m-1])
        {
            return dp[n][m] = 1+sub(s, t, n-1, m-1);
        }
        else
        {
            return dp[n][m] = max(sub(s, t, n-1, m), sub(s, t, n, m-1));
        }
    }
public:
    bool isSubsequence(string s, string t) {
        int n=s.size();
        int m=t.size();
        memset(dp, -1, sizeof(dp));
        return sub(s, t, n, m)==n;
    }
};