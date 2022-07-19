class Solution {
    public boolean isAnagram(String s, String t) {
          if(s.length() != t.length()) return false;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
            int cf = map.get(ch);
            int nf = cf + 1;
            map.put(ch, nf);
            }
            else {
                map.put(ch, 1);
            }
        }
        
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            if(map.containsKey(ch) && map.get(ch) != 0){
                int cf = map.get(ch);
                int nf = cf - 1;
                map.put(ch, nf);
            } else{
                return false;
            }
        }
        
        return true;
    }
}