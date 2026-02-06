class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean visited[]=new boolean[isConnected.length+1];
        int c=0;
        for(int i=1;i<isConnected.length+1;i++){
            if(visited[i]==false){
                c++;
                dfs(i,visited,isConnected);
            }
        }
        return c;
    }
    public void dfs(int node,boolean visit[],int[][] connect){
        visit[node]=true;
        for(int i=0;i<connect.length;i++){
            if(visit[i+1]==false && connect[node-1][i]==1){
                dfs(i+1,visit,connect);
            }
        }
    }
}