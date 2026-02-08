class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }else if(grid[i][j]==1) fresh++;
            }
        }
        //System.out.println(fresh);
        if(fresh==0) return 0;
        int t=0;
        int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int s=q.size();
            boolean r=false;
            for(int i=0;i<s;i++){
                int[] cell=q.poll();
                for(int[] d : dir){
                    int nr=cell[0]+d[0];
                    int nc=cell[1]+d[1];
                    if(nr>=0 && nc>=0 && nr<n && nc<m && grid[nr][nc]==1){
                        fresh--;
                        grid[nr][nc]=2;
                        q.offer(new int[]{nr,nc});
                        r=true;
                    }
                }
            }
            if(r) t++;
        }
        //System.out.println(fresh);
        return fresh==0? t: -1;   
    }
        
}