class Solution {
    public boolean isHappy(int n) {
         int slow = n;
        int fast = calSumSqr(n);
        while(fast!=1 && slow!=fast){
            slow = calSumSqr(slow);
            fast = calSumSqr(calSumSqr(fast));
        }
        return fast == 1;
    }
    private int calSumSqr(int num){
        int sumSqr = 0;
        while(num>0){
            int digit = num % 10;
            sumSqr += (digit * digit);
            num/=10;
        }
        return sumSqr;
    }
}