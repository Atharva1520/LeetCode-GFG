class Solution {
   int count =0;
    public int countVowelStrings(int n) {
        String[] s= new String[]{"e","i","o","u","a"};
        
       int ans = solve(0,n,s);
        return ans;
    }
    public int solve(int ind , int n ,String[] s){
        if(n==0){
            return 1;
        }
        if(ind>=s.length)return 0;
        
        int pick = solve(ind,n-1,s);
        int notPick = solve(ind+1,n,s);
        
        return (pick+notPick);
    }
}