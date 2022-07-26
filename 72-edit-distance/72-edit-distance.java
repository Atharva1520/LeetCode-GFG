class Solution {
    public int minDistance(String s1, String s2) {
     int n = s1.length();
        int m = s2.length();
        int prev[]=new int[m+1];
                    

        for(int j=0;j<=m;j++)prev[j]=j;
        
        for(int i=1;i<=n;i++){
            int cur[]=new int[m+1];
            cur[0]=i;
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    cur[j]=prev[j-1];
                }else{
                    cur[j]=1+Math.min(prev[j],Math.min(cur[j-1],prev[j-1]));
                }
            }
                prev = cur;
            
        }
        return prev[m];
        
    }
}
