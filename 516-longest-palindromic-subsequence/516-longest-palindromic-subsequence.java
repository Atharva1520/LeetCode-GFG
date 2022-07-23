class Solution {
    public int lcs(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        
        int[] prev=new int[n+1];
            
        for(int i=1; i<=m; i++){
            int[] curr=new int[n+1];
            for(int j=1; j<=n; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    curr[j] = 1 + prev[j-1];
                }
                else
                curr[j] = Math.max(prev[j],curr[j-1]);
            }
            prev=curr;
        }
    
        return prev[n];
    }
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb=new StringBuilder(s);  
    sb.reverse();  
    String s2= sb.toString();  
     return lcs(s,s2);
    }
}