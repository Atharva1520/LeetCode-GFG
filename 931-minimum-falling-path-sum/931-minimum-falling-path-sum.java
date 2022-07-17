class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        
        int[] prev=new int[n];
        
        
        Arrays.fill(prev,0);
        
       
       
       for(int j=0;j<n;j++){
           prev[j]=matrix[m-1][j];
       }
        
        
        for(int i=m-2;i>=0;i--){
            
            int[] curr=new int[n];
            
            for(int j=0;j<n;j++){

                int up=prev[j];

                int left=0;
                if(j-1>=0) left+=prev[j-1];
                else left+=Integer.MAX_VALUE; 
                
              
                int right=0;
                if(j+1<n) right+=prev[j+1];
                else right+=Integer.MAX_VALUE; ;
                
                curr[j]=matrix[i][j]+  Math.min(up,Math.min(left,right));
            }
            prev=curr;
        }
        
        int result=Integer.MAX_VALUE;
        
        for(int j=0;j<n;j++){
            result=Math.min(result,prev[j]);
        }

        
        return result;
    }
}