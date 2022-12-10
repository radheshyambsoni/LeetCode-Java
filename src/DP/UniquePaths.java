package DP;

// https://leetcode.com/problems/unique-paths/ - Medium
// December 09, 2022 - 0ms one

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        // Runtime 0 ms Beats 100%
        // Memory 41.6 MB Beats 10.19%
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                arr[j]+=arr[j-1];
            }
        }
        return arr[n-1];

        // Runtime 1 ms Beats 73.96%
        // Memory 40.8 MB Beats 51.95%
        // int dp[][]=new int[m][n];
        
        // for(int i=0;i<m;i++){
            //     dp[i][0]=1;
            // }
            // for(int i=1;i<n;i++){
                //     dp[0][i]=1;
                // }
        // for(int i=1;i<m;i++){
        //     for(int j=1;j<n;j++){
        //         dp[i][j]=dp[i-1][j]+dp[i][j-1];
        //     }
        // }
        
        // return dp[m-1][n-1];
    }
}
