// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}// } Driver Code Ends


class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
         ArrayList<Integer> ans=new ArrayList<Integer>();
        
        Map<Integer,Integer> map=new HashMap<>();
        
        int j=0,i=0;
        
        while(j<n){
            map.put(A[j],map.getOrDefault(A[j],0)+1);
            if(j-i+1<k){
                j++;
            }else if(j-i+1==k){
                ans.add(map.size());
                if(map.get(A[i])==1){
                    map.remove(A[i]);
                }
                else if(map.get(A[i])>1){
                    map.replace(A[i],map.get(A[i])-1);
                }
                
                i++;
                j++;
            }
        }
        return ans;
    

    }
}

