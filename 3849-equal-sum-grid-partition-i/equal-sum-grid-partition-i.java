class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
       long totalsum=0;
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            totalsum+=grid[i][j];
        }
       }
       if(totalsum%2!=0) return false;
       long target=totalsum/2;
       long rowsum=0; 
       for(int i=0;i<n-1;i++){
        for(int j=0;j<m;j++){
            rowsum+=grid[i][j];
        }
        
        if(rowsum==target) return true;
       }

       long colsum=0; 
       for(int i=0;i<m-1;i++){
        for(int j=0;j<n;j++){
            colsum+=grid[j][i];
        }
        
        if(target==colsum) return true;
       }
        return false;
    }
}