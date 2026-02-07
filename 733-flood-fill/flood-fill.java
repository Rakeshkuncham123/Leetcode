class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initial=image[sr][sc];
        if(initial==color) return image;

        dfs(image,sr,sc,color,initial);
        return image;
    }
    public void dfs(int[][] image,int i,int j,int color,int initial){
        if(i<0 || j<0 || i>=image.length || j>=image[0].length || image[i][j]!=initial ){
            return;
        }
        image[i][j]=color;
        dfs(image,i-1,j,color,initial);
        dfs(image,i+1,j,color,initial);
        dfs(image,i,j-1,color,initial);
        dfs(image,i,j+1,color,initial);
    }
}