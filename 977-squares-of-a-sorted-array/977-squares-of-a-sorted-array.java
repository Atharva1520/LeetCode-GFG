class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[] = new int[nums.length];
        int i=0;
        int j = nums.length -1;
        int k = nums.length-1;
        while(i<=j){
            int v1 = nums[i] * nums[i];
            int v2 = nums[j]*nums[j];
            if(v1>v2){
                ans[k] = v1;
                i++;
            }else{
                ans[k] = v2;
                j--;
            }
            k--;
        }
        return ans;
    }
}