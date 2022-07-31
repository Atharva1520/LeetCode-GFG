class Solution {
    public String longestPalindrome(String s) {
          int n = s.length(), resultSIndex = 0, resultEIndex = 0, maxLength = 0;
		boolean[][] dp = new boolean[n][n];
		for(int i=0;i<n;i++) 
			dp[i][i] = true;
		for(int i=0;i<n;i++){ // i will be our end index
			for(int j=0;j<i;j++){ // j will be our start index
				if(s.charAt(i) == s.charAt(j)){ 
					if(i-j == 1 || dp[i-1][j+1]){ // Is Pali if length is 2 or inner substring is pali
                        dp[i][j] = true;
						if(i-j > maxLength){
							maxLength = i-j;
							resultSIndex = j;
							resultEIndex = i;
						}
					}
				}
			}
		}
		return s.substring(resultSIndex, resultEIndex+1);
    }
}