package DP.Medium;

import java.util.Arrays;

// 2684. Maximum Number of Moves in a Grid
// https://leetcode.com/problems/maximum-number-of-moves-in-a-grid/
// Runtime 4 ms Beats 97.97%
// Memory 54.8 MB Beats 36.12%
// Sep 10, 2023

public class MaximumNumberOfMovesInAGrid_2684 {
    int f(int[][] grid, int row, int col, int[][] dp) {
        if (col == grid[0].length - 1)
            return 0;

        if (dp[row][col] != -1)
            return dp[row][col];

        int diagUp = 0;
        if (row > 0 && grid[row][col] < grid[row - 1][col + 1])
            diagUp = 1 + f(grid, row - 1, col + 1, dp);

        int right = 0;
        if (grid[row][col] < grid[row][col + 1])
            right = 1 + f(grid, row, col + 1, dp);

        int diagDown = 0;
        if (row < grid.length - 1 && grid[row][col] < grid[row + 1][col + 1])
            diagDown = 1 + f(grid, row + 1, col + 1, dp);

        return dp[row][col] = Math.max(right, Math.max(diagUp, diagDown));
    }

    public int maxMoves(int[][] grid) {
        int max = 0;
        int[][] dp = new int[grid.length][grid[0].length];
        for (int[] arr : dp)
            Arrays.fill(arr, -1);

        for (int i = 0; i < grid.length; i++) {
            max = Math.max(max, f(grid, i, 0, dp));
        }

        return max;
    }
}