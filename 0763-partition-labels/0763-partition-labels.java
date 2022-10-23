class Solution {
    public List<Integer> partitionLabels(String s) {
         HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        int cur=0;
        int prev =-1;
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            cur = Math.max(cur,map.get(s.charAt(i)));
            if(cur == i){
                res.add(cur-prev);
                prev = cur;
            }
        }
        return res;
        
    }
}