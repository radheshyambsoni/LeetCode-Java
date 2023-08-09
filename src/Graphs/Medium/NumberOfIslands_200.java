package Graphs.Medium;

// 200. Number of Islands
// https://leetcode.com/problems/number-of-islands/
// Runtime 2 ms Beats 100%
// Memory 47.4 MB Beats 84.58%
// Aug 09, 2023

public class NumberOfIslands_200 {
    public int numIslands(char[][] grid) {
        int cnt = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    cnt++;
                    dfs(grid, i, j);
                }
            }
        }

        return cnt;
    }

    void dfs(char[][] grid, int i, int j) {
        grid[i][j] = '2';
        if (j > 0 && grid[i][j - 1] == '1')
            dfs(grid, i, j - 1);
        if (i > 0 && grid[i - 1][j] == '1')
            dfs(grid, i - 1, j);
        if (j < grid[0].length - 1 && grid[i][j + 1] == '1')
            dfs(grid, i, j + 1);
        if (i < grid.length - 1 && grid[i + 1][j] == '1')
            dfs(grid, i + 1, j);
    }
}