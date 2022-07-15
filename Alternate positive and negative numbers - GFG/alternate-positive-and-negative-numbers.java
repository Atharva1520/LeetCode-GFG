// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int a[], int n) {
        // code here
        Queue<Integer> po=new LinkedList<>();
       Queue<Integer> ne=new LinkedList<>();
       for(int i=0;i<n;i++){
           if(a[i]>=0)po.add(a[i]);
           else ne.add(a[i]);
       }
       int i=0;
       while(!po.isEmpty()&&!ne.isEmpty()){
           a[i++]=po.poll();
           a[i++]=ne.poll();
       }
       while(!po.isEmpty())a[i++]=po.poll();
       while(!ne.isEmpty())a[i++]=ne.poll();
   
    }
}