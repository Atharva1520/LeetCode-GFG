class Solution {
    public int balancedStringSplit(String s) {
        int l=0;
        int r =0;
        int count=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == 'L')l++;
            else r++;
            if(l==r)count++;
        }
        return count;
    }
}