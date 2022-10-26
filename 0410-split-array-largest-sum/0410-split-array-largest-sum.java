class Solution {
    public int splitArray(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0 ) {
            return 0;
        }
        int maxi = Integer.MIN_VALUE;
        int sum=0;
         int ans=0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            maxi = Math.max(maxi,nums[i]);
        }
        if(k == 1)return sum;
        else if(k == nums.length)return maxi;
        else{
           
            int l = maxi;
            int r = sum;
            while(l <= r){
                int m = l + (r-l)/2;
                if(isPossible(nums,k, m)){
                    ans=m;
                    r = m-1;
                }else{
                    l = m + 1;
                }
            }
        }
        return ans;
    }
    static boolean isPossible(int [] nums,int k,int m){
        int sum=0;
        int partitions =1;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(sum > m ){
                partitions++;
                sum = nums[i];
            }
        }
        if(partitions <= k)return true;
        return false;
    }
}