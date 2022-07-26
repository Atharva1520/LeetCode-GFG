class Solution {
    public int maxProfit(int[] prices) {
       int n=prices.length;
        int mini = prices[0];
        int profit = 0;
        for(int i=1;i<n;i++){
            int cost = prices[i]-mini;
            profit = Math.max(profit,cost);
            mini = Math.min(mini,prices[i]);
        }
        return profit;
    }
}