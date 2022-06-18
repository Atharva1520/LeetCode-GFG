// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt ();

    		System.out.println (new Sol().closestToZero (arr, n));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int closestToZero (int arr[], int n)
    {
        Arrays.sort(arr);
        int i = 0 ;
        int j = n-1;
        int maxSum = arr[0] + arr[n-1];
        while(i < j){
            int currSum = arr[i] + arr[j];
            if(currSum  == 0)
                return 0 ;
         if(currSum < 0){
                i++;
            }else{
                j--;
            }
            if(Math.abs(currSum) < Math.abs(maxSum)){
                maxSum = currSum;
            }
            if(Math.abs(currSum) == Math.abs(maxSum)){
                maxSum = Math.max(currSum,maxSum);
            }
        }
            return maxSum;
    }
}