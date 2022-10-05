class Solution {
    public int longestOnes(int[] arr, int k) {
        int i=0;
        int j =0;
        while(i<arr.length){
            if(arr[i] == 0){
                k--;
            }
           if(k < 0){
               if(arr[j] == 0){
                   k++;
               }
               j++;
           }
            
            i++;
        }
        return i-j;
    }
}