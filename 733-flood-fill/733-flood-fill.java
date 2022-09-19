class Solution {
     public void helper(int[][] image, int sr, int sc, int color, int prevColor, boolean[][] visited){
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || visited[sr][sc] || image[sr][sc] != prevColor)
            return;
        image[sr][sc] = color;
        visited[sr][sc] = true;
        helper(image, sr+1, sc, color, prevColor, visited);
        helper(image, sr-1, sc, color, prevColor, visited);
        helper(image, sr, sc+1, color, prevColor, visited);
        helper(image, sr, sc-1, color, prevColor, visited);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] visited = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, image[sr][sc], visited);
        return image;
    }
}