package DP.Hard;

import java.util.Arrays;

// 1463. Cherry Pickup II
// https://leetcode.com/problems/cherry-pickup-ii/
// Runtime 23 ms Beats 80.35%
// Memory 45.86 MB Beats 56.73%
// Feb 11, 2024

public class CherryPickup2_1463 {
    int[][] moves = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 0 }, { 0, 1 }, { 1, -1 }, { 1, 0 }, { 1, 1 } };

    int f(int[][] g, int r, int c1, int c2, int[][][] dp) {
        if (r == g.length) {
            return 0;
        }

        if (dp[r][c1][c2] != -1) {
            return dp[r][c1][c2];
        }

        int cnt = c1 == c2 ? g[r][c1] : g[r][c1] + g[r][c2];
        int max = 0;
        for (int i = 0; i < 9; i++) {
            int x = c1 + moves[i][0], y = c2 + moves[i][1];
            if (x < 0 || x >= g[0].length || y < 0 || y >= g[0].length) {
                continue;
            }
            max = Math.max(max, f(g, r + 1, x, y, dp));
        }

        return dp[r][c1][c2] = cnt + max;
    }

    public int cherryPickup(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][][] dp = new int[m][n][n];
        for (int[][] mat : dp) {
            for (int[] arr : mat) {
                Arrays.fill(arr, -1);
            }
        }

        return f(grid, 0, 0, grid[0].length - 1, dp);
    }
}