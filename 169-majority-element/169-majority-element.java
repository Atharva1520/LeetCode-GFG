class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
            int ans = 0;
        if(n == 1){
            ans = nums[0];
        }else{
        int count = n/2;
    
        for(int i=0;i<n-1;i++){
            if(nums[i] == nums[i+1]){
                count--;
                if(count == 0){
                    ans = nums[i];
                }
            }else{
                count = n/2;
            }
        }
        }
        return ans;
    }
}