package Graphs.Medium;

// 1020. Number of Enclaves
// https://leetcode.com/problems/number-of-enclaves/description/
// Runtime 5 ms Beats 99.76%
// Memory 54.96 MB Beats 47.09%
// Dec 03, 2023

public class NumberOfEnclaves_1020 {
    void dfs(int[][] g, int i, int j) {
        if (i < 0 || j < 0 || i >= g.length || j >= g[0].length || g[i][j] == 0) {
            return;
        }
        g[i][j] = 0;
        dfs(g, i - 1, j);
        dfs(g, i + 1, j);
        dfs(g, i, j - 1);
        dfs(g, i, j + 1);
    }

    public int numEnclaves(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        for (int j = 0; j < n; j++) {
            if (grid[0][j] == 1) {
                dfs(grid, 0, j);
            }
            if (grid[m - 1][j] == 1) {
                dfs(grid, m - 1, j);
            }
        }
        for (int i = 1; i < m - 1; i++) {
            if (grid[i][0] == 1) {
                dfs(grid, i, 0);
            }
            if (grid[i][n - 1] == 1) {
                dfs(grid, i, n - 1);
            }
        }

        int cnt = 0;
        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                cnt += grid[i][j];
            }
        }

        return cnt;
    }
}