class Solution {
    public int majorityElement(int[] nums) {
        int cur=0;
        int cnt=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(cnt == 0){
                cur = nums[i];
            }
            if(cur == nums[i]){
                cnt +=1;
            }else{
                cnt -= 1;
            }
        }
        return cur;
    }
}