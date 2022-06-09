// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String arr[] = in.readLine().trim().split("\\s+");
            int A = Integer.parseInt(arr[0]);
            int B = Integer.parseInt(arr[1]);
            int C = Integer.parseInt(arr[2]);
            
            Solution ob = new Solution();
            System.out.println(ob.inSequence(A, B, C));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int inSequence(int A, int B, int C){
     
       if(C==0){
         if(A==B)  return 1;
         return 0;
     }
        double k=(double)((B-A))/C+1;
       
        if(k>0&&k==(int)k)
        return 1;
        else 
        return 0;
    }
}