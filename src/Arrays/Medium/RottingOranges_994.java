package Arrays.Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// 994. Rotting Oranges
// https://leetcode.com/problems/rotting-oranges/
// Runtime 2 ms Beats 83.93%
// Memory 41.3 MB Beats 41.22%
// Sep 24, 2023

public class RottingOranges_994 {

}

class Solution {
    // boolean isUntouchable(int[][] grid, int i, int j) {
    // int m = grid.length, n = grid[0].length;
    // int up = i > 0 ? grid[i - 1][j] : -1;
    // int down = i < m - 1? grid[i + 1][j] : -1;
    // int left = j > 0 ? grid[i][j - 1] : -1;
    // int right = j < n - 1 ? grid[i][j + 1] : -1;

    // return (up == -1 || up == 0) & (down == -1 || down == 0) & (left == -1 ||
    // left == 0) & (right == -1 || right == 0);
    // }
    public int orangesRotting(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        ArrayList<int[]> rotten = new ArrayList<>();
        int fresh = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    rotten.add(new int[] { i, j });
                } else if (grid[i][j] == 1) {
                    // if(isUntouchable(grid, i, j))
                    // return -1;
                    fresh++;
                }
            }
        }

        if (fresh == 0)
            return 0;

        if (rotten.size() == 0)
            return -1;

        Queue<int[]> q = new LinkedList<>(rotten);
        boolean[][] v = new boolean[m][n];
        int mins = 0, freshVisited = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] pos = q.poll();
                int r = pos[0], c = pos[1];
                if (r > 0 && grid[r - 1][c] == 1 && !v[r - 1][c]) {
                    v[r - 1][c] = true;
                    q.offer(new int[] { r - 1, c });
                    freshVisited++;
                }
                if (r < m - 1 && grid[r + 1][c] == 1 && !v[r + 1][c]) {
                    v[r + 1][c] = true;
                    q.offer(new int[] { r + 1, c });
                    freshVisited++;
                }
                if (c > 0 && grid[r][c - 1] == 1 && !v[r][c - 1]) {
                    v[r][c - 1] = true;
                    q.offer(new int[] { r, c - 1 });
                    freshVisited++;
                }
                if (c < n - 1 && grid[r][c + 1] == 1 && !v[r][c + 1]) {
                    v[r][c + 1] = true;
                    q.offer(new int[] { r, c + 1 });
                    freshVisited++;
                }
            }
            if (!q.isEmpty())
                mins++;
        }

        return freshVisited == fresh ? mins : -1;
    }
}