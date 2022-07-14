class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        
        if(n == 1){
            return nums[0];
        }
        int arr1[] = new int[n];
        
        int arr2[] = new int[n];
        int j = 0;
        int k = 0;
       for(int i = 1;i<n;i++){
           arr1[j] = nums[i];
           j++;
       }
        for(int i = 0 ; i < n - 1;i++){
            arr2[k] = nums[i];
            k++;
        }
        
        int ans = Math.max(robber2(arr1),robber2(arr2));
        return ans;
    }
    
    public int robber2(int [] nums){
        int prev = nums[0];
        int prev2 =0;
        for(int i=1;i<nums.length;i++){
            int take = nums[i];
            if(i>1) take += prev2;
            
            int not_take = 0 + prev;
            
            int curi = Math.max(take,not_take);
            prev2 = prev;
            prev = curi;
        }
        return prev;
    }
}