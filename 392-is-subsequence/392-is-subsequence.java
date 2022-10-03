class Solution {
    public boolean isSubsequence(String s, String t) {
        return f(0,0,s,t);
    }
    static boolean f(int i,int j,String s,String t){
        if(i == s.length())return true;
        if(i < s.length() && j == t.length())return false;
        if(s.charAt(i) == t.charAt(j)){
          return  f(i+1,j+1,s,t);
        }else{
          return  f(i,j+1,s,t);
        }
        
    }
}