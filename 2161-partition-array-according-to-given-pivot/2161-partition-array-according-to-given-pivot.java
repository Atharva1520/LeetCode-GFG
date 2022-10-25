class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int ans[] = new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int p =i;
        int q = j;
        while(i<nums.length&& j>=0){
            if(nums[i] < pivot)ans[p++]=nums[i];
            if(nums[j] > pivot)ans[q--]=nums[j];
            i++;
            j--;
        }
        while (p <= q) ans[p++] = pivot ;
        return ans;
    }
}