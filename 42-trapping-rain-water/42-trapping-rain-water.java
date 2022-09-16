class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        int maxL=0;
        int maxR=0;
        int l=0;
        int r =n-1;
        int res =0;
        while(l < r){
            if(arr[l] <= arr[r]){
                if(arr[l] > maxL) maxL = arr[l];
                else res += maxL - arr[l];
                l++;
            }else{
                if(arr[r] > maxR) maxR = arr[r];
                else res += maxR - arr[r];
                r--;
            }
        
        }
            return res;
    }
}