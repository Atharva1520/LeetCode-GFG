class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder ans = new StringBuilder();
            StringBuilder st = new StringBuilder();
        for(int i=0;i<=pattern.length();i++){
            st.append((char) ('1'+i));
            if(i == pattern.length() || pattern.charAt(i) == 'I'){
                ans.append(st.reverse());
                st = new StringBuilder();
            }
        }
        return ans.toString();
    }
}