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
            String s = sc.next();
            int pos = sc.nextInt();
    		System.out.println (new Sol().closing (s, pos));
        }
        
    }
}
// Contributed By: Pranay Bansal
// } Driver Code Ends


//User function Template for Java

class Sol
{
    int closing (String s, int pos)
    {
       int counter = 0 ;
  
        for(int i = pos +  1 ;i < s.length();i++){
            char ch = s.charAt(i);
     if(ch == '['){
         counter++;
     }      else if(ch==']'){
         
    if(counter == 0){
        return i;
    }else{
        counter--;
    }
     }
        }
        return 0; 
    }
}