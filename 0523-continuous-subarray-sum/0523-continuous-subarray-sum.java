class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
     HashMap<Integer,Integer> map = new HashMap<>();
        int cur =0;
        for(int i=0;i<nums.length;i++){
            cur += nums[i];
            cur %= k;
            if(cur == 0 && i>0)return true;
            
            if(map.containsKey(cur) && i - map.get(cur) > 1)return true;
            
            if(!map.containsKey(cur)){
                map.put(cur,i);
            }
        }
        return false;
    }
}