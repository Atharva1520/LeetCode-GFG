class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
           
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = 
                         new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            maxHeap.add(entry);
        }
        int ans[] = new int[k];
             int i = 0;
             while(i < k){
                 Map.Entry<Integer,Integer> entry   = maxHeap.poll();
                 ans[i] = entry.getKey();
                 i++;
                 
             }
             return ans;
    }
}