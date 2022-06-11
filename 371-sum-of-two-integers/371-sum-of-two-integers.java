class Solution {
    public int getSum(int a, int b) {
        while(a >0){
          a--;
            b++;
        }
         while(a<0){
             b--;
            a++;
        }
        return b;
    }
}