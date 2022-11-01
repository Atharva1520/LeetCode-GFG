class RandomizedSet {
    ArrayList<Integer> nums;
    HashMap<Integer,Integer> map;
    Random random;
    public RandomizedSet() {
        nums = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        map.put(val,nums.size());
        nums.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        int ind = map.get(val);
        int lastind = nums.size() - 1;
        if(ind != lastind){
            int last = nums.get(lastind);
            nums.set(ind,last);
            map.put(last,ind);
        }
        nums.remove(lastind);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        return nums.get(random.nextInt(nums.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */