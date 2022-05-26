// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int t=0;t<testCases;t++){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    ArrayList<Integer> A = new ArrayList<Integer>();
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		        A.add(arr[i]);
		        
		    }
		   
		   
		    
		    ArrayList <ArrayList<Integer>> res = new Solution().subsets(A);
		    for (int i = 0; i < res.size (); i++)
		    {
		        for (int j = 0; j < res.get(i).size (); j++)
		        {
		          System.out.print(res.get(i).get(j)+" ");
		        }
		        System.out.println();
		      
		    }
		    //System.out.println();
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A)
    {
       ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        solve(A,0,A.size(),new ArrayList<>(),ans);
        Collections.sort(ans,new Comparator<ArrayList<Integer>>(){
            
            public int compare(ArrayList<Integer> ls1,ArrayList<Integer> ls2){
                int n=Math.min(ls1.size(),ls2.size());
                for(int i=0;i<n;i++){
                    int a=ls1.get(i),b=ls2.get(i);
                    if(a!=b) return a-b;
                }
                return ls1.size()-ls2.size();
            }
        });
        return ans;
    }
    public static void solve(ArrayList<Integer> A,int ind,int n,ArrayList<Integer> ls,ArrayList<ArrayList<Integer>> ans){
        if(ind==n){
            ans.add(new ArrayList<>(ls));
            return;
        }
        ls.add(A.get(ind));
        solve(A,ind+1,n,ls,ans);
        ls.remove(ls.size()-1);
        solve(A,ind+1,n,ls,ans);
    }
}