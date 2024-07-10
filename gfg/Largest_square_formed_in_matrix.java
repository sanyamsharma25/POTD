
class Solution {
    static int solve(int mat[][],int i,int j,int[][] dp){
        if (i < 0 || j < 0) {
            return 0;
        }
        
        if(dp[i][j]!=-1) return dp[i][j];
        if(mat[i][j]==0){
            dp[i][j]=0;
            return 0;
        }
            
        
        int size = 1 + Math.min(Math.min(solve(mat, i - 1, j,dp),
                                         solve(mat, i, j - 1,dp)),
                                solve(mat, i - 1, j - 1,dp));
                                
        return dp[i][j]=size;
    }
    static int maxSquare(int n, int m, int mat[][]) {
        // code here
        int maxSide = 0;
        int dp[][]=new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=-1;
            }
        }
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    maxSide = Math.max(maxSide, solve(mat, i, j,dp));
                }
            }
        }

        return maxSide;
    }
}