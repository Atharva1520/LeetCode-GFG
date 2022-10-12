class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int m = accounts[0].length;
        int max = Integer.MIN_VALUE;
         int cur =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              
                cur+= accounts[i][j];
            }
            max = Math.max(cur,max);
            cur =0;
        }
        return max;
    }
}