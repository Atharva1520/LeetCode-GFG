class Solution {
   static char ch[] = new char[]{'a','e','i','o','u'};
    public int countVowelStrings(int n) {
        int ans =0;
        for(char c : ch){
            ans += f(n-1,c);
        }
        return ans;
    }
    static int f(int length,char pre){
        if(length == 0)return 1;
        int ans =0;
        for(char c : ch){
            if(pre >= c ){
                ans += f(length-1,c);
            }
        }
        return ans;
    }
}