class Solution {
    public int smallestEvenMultiple(int n) {
        int num = n * 2;
        int min = num;
        for(int i = num ;i > 0;i--){
            if(i % 2 == 0 && i % n == 0){
                min = Math.min(min,i);
            }
        }
        return min;
    }
}