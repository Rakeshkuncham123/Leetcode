class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int s=0;
        
        for(int i=0;i<m;i++){
            if(grid[s][i]==1) dfs(grid,s,i);
            if(grid[n-1][i]==1) dfs(grid,n-1,i);
        }
        for(int j=1;j<n-1;j++){
            if(grid[j][s]==1) dfs(grid,j,s);
            if(grid[j][m-1]==1) dfs(grid,j,m-1);
        }
        int res=0;
        for(int i=1;i<n-1;i++){
            for(int j=1;j<m-1;j++){
                if(grid[i][j]==1) res++;
            }
        }
        return res;
    }
    public void dfs(int[][] grid,int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0) return;
        grid[i][j]=0;
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
}