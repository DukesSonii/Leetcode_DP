class Solution{
    public int longestCommonSubsequence(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                dp[i][j]=-1;
            }
        }                           
        return lcs2(s1,s2,n-1,m-1,dp);
    }
     public static int lcs2(String s1, String s2, int n, int m, int dp[][]){
        if(n<0 || m<0){
            return 0;
        }
        
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        
        if(s1.charAt(n) == s2.charAt(m)){
            return dp[n][m] = 1 + lcs2(s1,s2,n-1,m-1,dp);    //return krne se pehle ans ko dp[n][m]mai 
        } else{
            int ans1 = lcs2(s1,s2,n-1,m,dp);
            int ans2 = lcs2(s1,s2,n,m-1,dp);
            return dp[n][m] = Math.max(ans1,ans2);
        }
    }
}
