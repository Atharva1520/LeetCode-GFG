class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length()!=t.length()) return false;
        
        for (int i=0; i<s.length(); i++) {
            char curr = s.charAt(i);
            t = t.replaceFirst(""+curr,"");
        }
        
        return t.length() == 0;
        
    }
}