package Graphs.Medium;

// 2658. Maximum Number of Fish in a Grid
// https://leetcode.com/problems/maximum-number-of-fish-in-a-grid/
// Runtime 3 ms Beats 100.00%
// Memory 43.98 MB Beats 26.55%
// Nov 11, 2023

public class MaxNumOfFishInAGrid_2658 {
    int dfs(int[][] g, int r, int c) {
        int coll = g[r][c];
        g[r][c] = 0;
        if (r > 0 && g[r - 1][c] > 0) {
            coll += dfs(g, r - 1, c);
        }
        if (r < g.length - 1 && g[r + 1][c] > 0) {
            coll += dfs(g, r + 1, c);
        }
        if (c > 0 && g[r][c - 1] > 0) {
            coll += dfs(g, r, c - 1);
        }
        if (c < g[0].length - 1 && g[r][c + 1] > 0) {
            coll += dfs(g, r, c + 1);
        }

        return coll;
    }

    public int findMaxFish(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    max = Math.max(max, dfs(grid, i, j));
                }
            }
        }

        return max;
    }
}