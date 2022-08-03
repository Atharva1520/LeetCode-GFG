class Solution {
public:
    bool isPalindrome(int i, int j, string &s)
    {
        while(i<j)
        {
            if(s[i] != s[j])
            {
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }
    int minCut(string s) {
     int n = s.size();
        vector<int> dp(n+2, 0);
        
        for(int i=n-1; i>=0; i--)
        {
            int minCost=1e8;

            for(int j=i; j<s.length(); j++)
            {
                int cost=1e8;
                if(isPalindrome(i, j, s))
                {
                    cost = 1+dp[j+1];
                }
                minCost = min(minCost, cost);
            }

            dp[i] = minCost;
        }
        
        return dp[0] - 1;
    }
};