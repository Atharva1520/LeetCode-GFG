// { Driver Code Starts
// Initial template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s[]=new String[2];
            s = read.readLine().split(" ");
            Solution ob = new Solution();

            System.out.println(ob.commonSubseq(s[0], s[1]));
        }
    }
}// } Driver Code Ends


// User function template for Java
class Solution {
    static int commonSubseq(String S1, String S2){
        int ans = 0 ;
        for(int i= 0; i<S2.length();i++){
            char ch = S1.charAt(i);
            
            if(S2.indexOf(ch) >= 0){
                ans = 1;
        }
        }
        return ans;
    }
}