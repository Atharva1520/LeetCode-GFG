class Solution {
    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op =0;
        int pist =0;
        for(int i=0;i<prices.length;i++){
            if(lsf > prices[i])lsf = prices[i];
            pist = prices[i]-lsf;
            if(pist > op){
                op = pist;
            }
        }
        return op;
    }
}