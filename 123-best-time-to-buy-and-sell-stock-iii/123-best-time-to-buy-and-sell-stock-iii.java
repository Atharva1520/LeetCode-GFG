class Solution {
    public int maxProfit(int[] a) {
        int n = a.length;
        int[][] after=new int[2][3];
        //ind->i,buy->j
        for(int i=n-1; i>=0; i--){
            int[][] cur=new int[2][3];
            for(int j=0; j<=1; j++){
                for(int cap=1; cap<=2; cap++){
                    int profit = 0;
                    if(j ==1){
                        cur[j][cap]=Math.max(-a[i]+after[0][cap],after[1][cap]);
                    }else{
                        cur[j][cap]=Math.max(a[i]+after[1][cap-1],after[0][cap]);
                    }
                }
            }
            after = cur;
        }     
        return after[1][2];
    
}
}