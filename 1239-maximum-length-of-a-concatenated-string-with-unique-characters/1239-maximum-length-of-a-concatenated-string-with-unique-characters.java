class Solution {
     int res = 0;
    public int maxLength(List<String> arr) {
        
        dfs(arr, 0, "");
        return res;
    }
    
    private void dfs(List<String> l, int idx, String s) {
        if (unique(s)) res = Math.max(res, s.length());
        else return;
        for (int i = idx; i < l.size(); i++) {  // start with idx;
            if (unique(l.get(i))) dfs(l, i + 1, s + l.get(i));
        }
    }
    
    private boolean unique(String s) {
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) {
            if (++cnt[c - 'a'] > 1) return false;
        }
        return true;
    }
    
}