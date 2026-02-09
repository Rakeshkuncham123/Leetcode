class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        int i=0;
        boolean[][] visit=new boolean[n][m];
        for(int j=0;j<m;j++){
            if(board[i][j]=='O'){
                dfs(board,i,j,visit);
            }
            if(board[n-1][j]=='O') dfs(board,n-1,j,visit);
            
        }
        for(int k=1;k<n-1;k++){
            if(board[k][i]=='O') dfs(board,k,i,visit);
            if(board[k][m-1]=='O') dfs(board,k,m-1,visit);
        }
        for(int l=1;l<n-1;l++){
            for(int j=1;j<m-1;j++){
                if(board[l][j]=='O' && visit[l][j]==false) board[l][j]='X';
            }
        }

        
       
    }
     public void dfs(char[][] board,int i,int j,boolean[][] visit){
            if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!='O' || visit[i][j]==true){
                return;
            }
            visit[i][j]=true;
            dfs(board,i+1,j,visit);
            dfs(board,i-1,j,visit);
            dfs(board,i,j+1,visit);
            dfs(board,i,j-1,visit);
        }
}