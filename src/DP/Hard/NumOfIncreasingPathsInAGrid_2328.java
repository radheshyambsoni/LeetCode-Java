package DP.Hard;

import java.util.Arrays;

// 2328. Number of Increasing Paths in a Grid
// https://leetcode.com/problems/number-of-increasing-paths-in-a-grid/
// Runtime 22 ms Beats 97.79%
// Memory 59.3 MB Beats 60.20%
// Sep 22, 2023

public class NumOfIncreasingPathsInAGrid_2328 {
    int MOD = (int) 1e9 + 7;

    long f(int[][] grid, int i, int j, int[][] dp) {
        if (dp[i][j] != -1)
            return dp[i][j];

        long sum = 0;
        if (i > 0 && grid[i][j] < grid[i - 1][j])
            sum += 1 + f(grid, i - 1, j, dp);

        if (j > 0 && grid[i][j] < grid[i][j - 1])
            sum += 1 + f(grid, i, j - 1, dp);

        if (i < grid.length - 1 && grid[i][j] < grid[i + 1][j])
            sum += 1 + f(grid, i + 1, j, dp);

        if (j < grid[0].length - 1 && grid[i][j] < grid[i][j + 1])
            sum += 1 + f(grid, i, j + 1, dp);

        return dp[i][j] = (int) (sum % MOD);
    }

    public int countPaths(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for (int[] arr : dp)
            Arrays.fill(arr, -1);

        long sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                sum += 1l + f(grid, i, j, dp);
            }
        }

        return (int) (sum % MOD);
    }
}