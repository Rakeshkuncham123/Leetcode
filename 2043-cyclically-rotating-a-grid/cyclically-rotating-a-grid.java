class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        int layers=Math.min(n,m)/2;
        for(int l=0;l<layers;l++){
            int top=l;
            int left=l;
            int right=m-l-1;
            int bottom=n-l-1;
            List<Integer> ls=new ArrayList<>();
            for(int col=left;col<=right;col++){
                ls.add(grid[top][col]);
            }
            for(int row=top+1;row<=bottom;row++){
                ls.add(grid[row][right]);
            }
            for(int col=right-1;col>=left;col--){
                ls.add(grid[bottom][col]);
            }
            for(int row=bottom-1;row>top;row--){
                ls.add(grid[row][left]);
            }
           
            Collections.rotate(ls,-k);
            for(int i=0;i<ls.size();i++){
                System.out.print(ls.get(i)+" ");
            }
            int i=0;    
            for(int col=left;col<=right;col++){
                grid[top][col]=ls.get(i);
                i++;
            }
            for(int row=top+1;row<=bottom;row++){
                grid[row][right]=ls.get(i);
                i++;
            }
            for(int col=right-1;col>=left;col--){
                grid[bottom][col]=ls.get(i);
                i++;
            }
            for(int row=bottom-1;row>top;row--){
                grid[row][left]=ls.get(i);
                i++;
            }
        }
        return grid;
    }
}