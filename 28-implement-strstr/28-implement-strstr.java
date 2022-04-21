class Solution {
    public int strStr(String haystack, String needle) {
         int needleLength = needle.length();
        if(needle == null || needle.isBlank() || haystack.equals(needle)){
            return 0;
        }
        
        for(int i=0;i<haystack.length();i++){
            if(i+needleLength <= haystack.length()){
                String substring=haystack.substring(i,i+needleLength);
                if(substring.equals(needle)){
                    return i;
                }
            }
        }
        
        return -1;
    }
}