class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(String str: strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            
            String sortedStr = new String(arr);
            
            List<String> group = map.getOrDefault(sortedStr, new ArrayList<>());
            group.add(str);
            map.put(sortedStr, group);
        }
        
        return new ArrayList<>(map.values()); 
    }
}