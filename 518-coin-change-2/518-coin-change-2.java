class Solution {
    public int change(int amount, int[] coins) {
       int n = coins.length;
        int prev[]=new int[amount+1];
        int cur[]=new int[amount+1];
        
        for(int t=0;t<= amount;t++)
           prev[t]=t%coins[0]==0?1:0;
        
        for(int ind =1;ind<n;ind++){
            for(int t = 0;t<=amount;t++){
                int not= prev[t];
                int take = 0;
                if(coins[ind] <= t)take=cur[t-coins[ind]];
                
                cur[t]=take+not;
            }
            prev = cur;
        }
        return prev[amount];
    }
}
 