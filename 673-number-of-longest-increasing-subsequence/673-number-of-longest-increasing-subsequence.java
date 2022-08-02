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
/* int[]lis=new int[nums.length];
    int count[]=new int[nums.length];
    Arrays.fill(lis,1);
      Arrays.fill(count,1);
    int max=1;
    for(int i=0;i<nums.length;i++){
        for(int j=0;j<i;j++){
            if(nums[i]>nums[j]&&lis[i]<lis[j]+1){
                lis[i]=lis[j]+1;
                count[i]=count[j];
            }else if(nums[i]>nums[j]&&lis[i]==lis[j]+1){
                count[i]+=count[j];
            }
        }
        max=Math.max(max,lis[i]);
    }   
    int countt=0;
  for(int i=0;i<nums.length;i++){
      if(lis[i]==max)
      {
          countt+=count[i];
          
      }
  }
    return countt;
}*/