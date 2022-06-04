// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        if (a.length() != b.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            if (map.containsKey(a.charAt(i))) {
                
                map.put(a.charAt(i),
                        map.get(a.charAt(i)) + 1);
            }
            else {
               
                map.put(a.charAt(i), 1);
            }
        }
        
        for (int i = 0; i < b.length(); i++) {
            
            if (map.containsKey(b.charAt(i))) {
                
                map.put(b.charAt(i),
                        map.get(b.charAt(i)) - 1);
            }
        }
       
        Set<Character> keys = map.keySet();
        
        for (Character key : keys) {
            if (map.get(key) != 0) {
                return false;
            }
        }
        
        return true;
        
    }
}