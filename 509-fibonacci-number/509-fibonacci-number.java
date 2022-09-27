class Solution {
   
        int ar[];
    public int helper(int n)
    {
        if(n==0||n==1)
           return n;
        if(ar[n]==0)
            ar[n]=helper(n-1)+helper(n-2);
        return ar[n];
    }
    public int fib(int n) {
        ar=new int[n+2];
        return helper(n);
    }
    
}