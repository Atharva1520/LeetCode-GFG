class LRUCache {
    
    LinkedHashMap<Integer,Integer> ans;
    int size;

    public LRUCache(int capacity) {
        this.size = capacity;
        this.ans = new LinkedHashMap<Integer,Integer>();
    }
    
    public int get(int key) {
        if(!ans.containsKey(key)){
            return -1;
        }
        int value = ans.get(key);
        ans.remove(key);
        ans.put(key,value);
        return value;
    }
    
    public void put(int key, int value) {
        if(ans.containsKey(key)){
            ans.remove(key);
        }
        ans.put(key,value);
        if(ans.size() > size){
          ans.remove(ans.keySet().iterator().next());
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */