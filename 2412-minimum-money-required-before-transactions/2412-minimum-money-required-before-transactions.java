class Solution {
    public long minimumMoney(int[][] transactions) {
        
        /*lets assume example 1
        after 2 transaction money will be needed is 4 for the last transaction
            and after 3rd transaction we will have 2 as money
            so to perform every transaction we will need that last cashback and last cost */
        long lost =0;
        int cashback=0;
        for(int[] a:transactions){
            lost += Math.max(0,a[0]-a[1]);
            cashback = Math.max(cashback,Math.min(a[0],a[1]));
        }
        return cashback + lost;
    }
}