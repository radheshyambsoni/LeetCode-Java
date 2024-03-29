package DP.Medium;

// 64. Minimum Path Sum
// https://leetcode.com/problems/minimum-path-sum/
// Runtime 2 ms Beats 79.82%
// Memory 45 MB Beats 64.34%
// February 13, 2023

public class MinPathSum {
    public int minPathSum(int[][] grid) {
        for(int i=1;i<grid[0].length;i++){
            grid[0][i]+=grid[0][i-1];
        }
        for(int i=1;i<grid.length;i++){
            grid[i][0]+=grid[i-1][0];
        }
        for(int i=1;i<grid.length;i++){
            for(int j=1;j<grid[0].length;j++){
                grid[i][j]+=Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}