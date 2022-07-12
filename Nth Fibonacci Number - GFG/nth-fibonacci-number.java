// { Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    static long nthFibonacci(long n){
      long a=0;
       long b=1;
       long c=1;
       long mod=1000000007;
       for(int i=2;i<=n;i++){
           c=(a+b)%mod;  
           a=b;
           b=c;
       }
       return c;
    }
}