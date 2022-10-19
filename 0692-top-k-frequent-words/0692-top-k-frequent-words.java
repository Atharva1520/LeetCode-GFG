class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String , Integer> freq = new HashMap<>();
    
    for(String word : words)
        freq.put(word,freq.getOrDefault(word , 0) + 1);
    
    ArrayList<String> res = new ArrayList<>(freq.keySet());
    
    Collections.sort(res , (a,b) -> freq.get(b) != freq.get(a) ? freq.get(b) - freq.get(a) : a.compareTo(b));
    
    return res.subList(0,k);
    }
}