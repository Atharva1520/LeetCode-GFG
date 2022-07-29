class Solution {
public:
    int maxProfit(vector<int>& prices, int fee) {
         int n = prices.size();
        int aheadnotbuy,aheadbuy,curbuy,curnotbuy;
        aheadbuy=aheadnotbuy = 0;
        for(int ind = n-1;ind >=0;ind--){
            //buy 
            curbuy = max(-prices[ind] + aheadnotbuy,0+aheadbuy);
            
            //sell
            curnotbuy = max(prices[ind] - fee + aheadbuy , 0+ aheadnotbuy);
            
            aheadnotbuy = curnotbuy;
        aheadbuy = curbuy;
        }
        return curbuy;
        
    }
};