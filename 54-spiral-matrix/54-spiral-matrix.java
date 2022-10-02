class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
       if(matrix == null || matrix.length ==0){
           return ans;
       }
        int top =0;
        int bot=matrix.length-1;
        int l = 0;
        int r = matrix[0].length-1;
        int size = matrix.length*matrix[0].length;
        while(ans.size() < size){
            for(int i=l;i<=r&&ans.size() < size;i++){
                ans.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bot&&ans.size() < size;i++){
                ans.add(matrix[i][r]);
            }
            r--;
            for(int i=r;i>=l&&ans.size() < size;i--){
                ans.add(matrix[bot][i]);
            }
            bot--;
            for(int i=bot;i>=top&&ans.size() < size;i--){
                ans.add(matrix[i][l]);
            }
            l++;
        }
        return ans;
    }
}