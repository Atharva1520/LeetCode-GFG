class Solution {
    static class Pair{
        String st;
        int freq;
        Pair(String st,int freq){
            this.st =st;
            this.freq = freq;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue(new Comparator<Pair>(){
            public int compare(Pair a,Pair b){
                if(a.freq == b.freq){
                    return a.st.compareTo(b.st);
                }else
                    return b.freq - a.freq;
            }
        });
        for(Map.Entry<String,Integer> e : map.entrySet()){
            pq.add(new Pair(e.getKey(),e.getValue()));
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i<k;i++){
            Pair r = pq.poll();
            ans.add(r.st);
        }
        return ans;
    }
}