class Solution {
    public int numIdenticalPairs(int[] nums) {
        int res =0;
        int cnt[] = new int[101];
        for(int a : nums){
            res += cnt[a]++;
        }
        return res;
    }
}