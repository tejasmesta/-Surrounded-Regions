class Solution {
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        
        for(int i=0;i<n;i++)
        {

            dfs(board,i,0,n,m);
            dfs(board,i,m-1,n,m);
            
        }
        
        for(int i=0;i<m;i++)
        {


            dfs(board,0,i,n,m);
            dfs(board,n-1,i,n,m);

        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
            
                if(board[i][j]=='#')
                {
                    board[i][j]='O';
                }
                else if(board[i][j]=='O')
                {
                    board[i][j]='X';
                }
                
            }
        }
        
    }
    
    public void dfs(char[][] b,int i,int j,int n,int m)
    {
        if(i<0 || i>=n || j<0 || j>=m || b[i][j]=='X' || b[i][j]=='#' ) 
            return;
        
        b[i][j]='#';
        
        dfs(b,i+1,j,n,m);
        dfs(b,i,j+1,n,m);
        dfs(b,i-1,j,n,m);
        dfs(b,i,j-1,n,m);
        
    }
}

