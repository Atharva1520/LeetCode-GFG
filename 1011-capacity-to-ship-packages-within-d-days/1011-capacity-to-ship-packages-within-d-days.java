class Solution {
    public int shipWithinDays(int[] weights, int days) {
       int max = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            sum += weights[i];
            max = Math.max(max,weights[i]);
        }
        int l = max;
        int r = sum;
        while(l<r){
            int m = l + (r-l)/2;
            if(possible(m,days,weights)){
                r = m;
            }else{
                l=m+1;
            }
        }
        return l;
    }
    static boolean possible(int wt,int d,int[] wts){
        int cur =0;
        int day =1;
        for(int i:wts){
            cur += i;
            if(cur > wt){
                day++;
                cur = i;
            }
        }
        return day <= d;
    }
}