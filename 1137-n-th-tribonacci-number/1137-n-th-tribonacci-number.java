class Solution {
    public int tribonacci(int n) {
        int prev3 = 0;
        int prev2 =1;
        int prev1 =1;
        int i=2;
        int cur=0;
        if(n == 0)return prev3;
        if(n <= 2)return prev2;
        while(i < n){
            cur = prev3+prev2+prev1;
            i++;
            prev3 = prev2;
            prev2 = prev1;
            prev1 = cur;
        }
        return cur;
    }
}