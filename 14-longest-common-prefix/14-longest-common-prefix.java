class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String ans ="";
        if(strs == null || strs.length == 0){
            return ans;
        }
        int index=0;
        for(char ch : strs[0].toCharArray()){
            for(int i=1;i<strs.length;i++){
                if(index >= strs[i].length() || ch != strs[i].charAt(index)){
                    return ans;
                }
            }
            ans += ch;
            index++;
        }
        return ans;
    }
}