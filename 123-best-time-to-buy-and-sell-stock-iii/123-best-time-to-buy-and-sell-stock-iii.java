class Solution {
    int func(int ind,int profit,int canBuy,int[] arr,int currTrans,int[][][] dp) {
        if(ind == arr.length) return 0;
        if(currTrans == 2) return 0;
        
        if(dp[ind][canBuy][currTrans] != -1) return dp[ind][canBuy][currTrans];
        if(canBuy == 1) {
            profit = Math.max( -arr[ind] + func(ind+1,profit,0,arr,currTrans,dp), func(ind+1,profit,1,arr,currTrans,dp));
        }
        else {
            //currTrans += 1;
            profit = Math.max(arr[ind] + func(ind+1,profit,1,arr,currTrans+1,dp) , func(ind+1,profit,0,arr,currTrans,dp));
        }
        return dp[ind][canBuy][currTrans] = profit;
    }
    public int maxProfit(int[] prices) {
        int[][][] dp = new int[prices.length+1][2][2];
        for(int i = 0;i <= prices.length;i++) {
            for(int j = 0;j < 2;j++) {
                for(int k = 0;k < 2;k++) {
                    dp[i][j][k] = -1;
                }
            }
        }
        return func(0,0,1,prices,0,dp);
    }
    
}