class Solution {
    public int[] Sum(int[] nums, int target) {
        HashMap<Integer,Integer> s = new HashMap<>();
        int a[] = new int[2];
        int n = nums.length;
        for(int i = 0 ; i  <n ;i++){
            if(s.containsKey(target - nums[i])){
            a[0] = s.get(target - nums[i]);
            a[1]  = i;
            break;
        }
        s.put(nums[i],i);
    }
        return a;
    }
}
