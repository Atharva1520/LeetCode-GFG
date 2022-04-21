class MyHashSet {
int arr[];
    public MyHashSet() {
        arr = new int[10000001];
    }
    
    public void add(int key) {
       arr[key] = 1;
    }
    
    public void remove(int key) {
        arr[key] =0;
    }
    
    public boolean contains(int key) {
        if(arr[key] == 0){
            return false;
        }else{
            return true;
        }
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */