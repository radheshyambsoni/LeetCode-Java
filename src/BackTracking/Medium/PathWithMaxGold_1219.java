package BackTracking.Medium;

// 1219. Path with Maximum Gold
// https://leetcode.com/problems/path-with-maximum-gold/
// Runtime 54 ms Beats 86.99%
// Memory 40.40 MB Beats 31.06%
// Nov 26, 2023

public class PathWithMaxGold_1219 {
    int f(int[][] g, int r, int c) {
        if (r < 0 || r >= g.length || c < 0 || c >= g[0].length || g[r][c] == 0) {
            return 0;
        }

        int curr = g[r][c];
        g[r][c] = 0;
        int max = 0;
        max = Math.max(max, f(g, r - 1, c));
        max = Math.max(max, f(g, r + 1, c));
        max = Math.max(max, f(g, r, c - 1));
        max = Math.max(max, f(g, r, c + 1));
        g[r][c] = curr;

        return curr + max;
    }

    public int getMaximumGold(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) {
                    max = Math.max(max, f(grid, i, j));
                }
            }
        }

        return max;
    }
}