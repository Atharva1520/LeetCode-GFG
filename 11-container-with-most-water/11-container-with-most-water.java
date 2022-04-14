class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        
        int maxMul = 0;
        int i = 0;
        int j = n-1;
        
        while(j>i){
           int currMul = (j-i)* Math.min(height[i],height[j]);
            maxMul = Math.max(currMul,maxMul);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxMul;
        
    }
}