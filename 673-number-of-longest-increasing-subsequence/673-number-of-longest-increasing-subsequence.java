class Solution {
    public int findNumberOfLIS(int[] arr) {
        int n = arr.length;
        int maxi = 1;
        int dp[]=new int[n];
        int cnt[]=new int[n];
         Arrays.fill(dp,1);
      Arrays.fill(cnt,1);
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[j] < arr[i] && 1 + dp[j] > dp[i]){
                    dp[i] = 1 + dp[j];
                    cnt[i] = cnt[j];
                }else if(arr[j] < arr[i] && 1 + dp[j] == dp[i]){
                    dp[i] = 1 + dp[j];
                    cnt[i] += cnt[j];
                }
            }
           maxi = Math.max(maxi,dp[i]);
        }
        int nos =0;
        for(int i=0;i<n;i++){
            if(dp[i] == maxi)nos += cnt[i];
        }
        return nos;
    }
}
