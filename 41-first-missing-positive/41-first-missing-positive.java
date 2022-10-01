class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int corpos=0;int i=0;
        while(i<n){
            corpos = nums[i]-1;
            if(corpos >= 0 && corpos < n&& nums[corpos] != nums[i]){
                swap(i,corpos,nums);
            }else{
                i++;
            }
        }
        for( i=0;i<n;i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return n+1;
    }
    public void swap(int i,int j , int[] arr){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}