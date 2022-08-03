class Solution {
public:
    int countSquares(vector<vector<int>>& matrix) {
        int m = matrix.size(), n = matrix[0].size();
	vector<vector<int>> dp(m + 1, vector<int>(n + 1, -1));
	int ans = 0;
	for(int i = m; i >= 0; i--) {
		for(int j = n; j >= 0; j--) {
			if(i == m || j == n || matrix[i][j] == 0) dp[i][j] = 0;
			else dp[i][j] = 1 + min({dp[i][j + 1], dp[i + 1][j + 1], dp[i + 1][j]});
			ans += dp[i][j];
		}
	}
	return ans;
    }
};