class Solution {
    public int maxProfit(int[] a) {
        int n = a.length;
        int[][][] dp=new int[n+1][2][3];
        
        for(int i=0; i<=n; i++){
            for(int b=0; b<=1; b++){
                dp[i][b][0] = 0;
            }
        }
        
        for(int b=0; b<=1; b++){
            for(int cap=0; cap<=2; cap++){
                dp[n][b][cap] = 0;
            }
        }
        
        for(int i=n-1; i>=0; i--){
            for(int b=0; b<=1; b++){
                for(int cap=1; cap<=2; cap++){
                    int profit = 0;
                    
                    if(b==1){
                        int buy = -a[i] + dp[i+1][0][cap];
                        int notBuy = dp[i+1][1][cap];
                        profit = Math.max(buy,notBuy);
                    }else{
                        int sell = a[i] + dp[i+1][1][cap-1];
                        int notSell = dp[i+1][0][cap];
                        profit = Math.max(sell,notSell);
                    }
                    dp[i][b][cap] = profit;
                }
            }
        }
        
        return dp[0][1][2];
    }
}