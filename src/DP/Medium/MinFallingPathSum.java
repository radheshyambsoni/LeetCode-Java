package DP.Medium;

// 931. Minimum Falling Path Sum
// https://leetcode.com/problems/minimum-falling-path-sum/
// Runtime 4 ms Beats 65.84%
// Memory 42.6 MB Beats 90.18%
// Februray 15, 2023
// Complete solution link

public class MinFallingPathSum {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<n;j++){
                matrix[i][j]+=Math.min(j>0?matrix[i+1][j-1]:Integer.MAX_VALUE,Math.min(matrix[i+1][j],j<n-1?matrix[i+1][j+1]:Integer.MAX_VALUE));
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,matrix[0][i]);
        }
        return min;
    }
}