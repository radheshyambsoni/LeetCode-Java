package Arrays.Medium;

import java.util.LinkedList;
import java.util.Queue;

// 1091. Shortest Path in Binary Matrix
// https://leetcode.com/problems/shortest-path-in-binary-matrix/
// Runtime 22 ms Beats 30.21%
// Memory 45.6 MB Beats 7.44%
// Sep 20, 2023

public class ShortestPathInBinaryMatrix_1091 {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1)
            return -1;
        int n = grid.length;
        // boolean[][] v = new boolean[n][n];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { 0, 0 });
        grid[0][0] = 1;// v[0][0] = true;
        int len = 1;
        int min = (int) 1e5;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] pos = q.poll();
                int r = pos[0], c = pos[1];
                if (r == n - 1 && c == n - 1) {
                    min = Math.min(min, len);
                    break;
                }
                if (r > 0) {
                    if (c > 0) {
                        if (grid[r - 1][c - 1] == 0) {
                            grid[r - 1][c - 1] = 1;
                            q.add(new int[] { r - 1, c - 1 });
                        }
                    }
                    if (grid[r - 1][c] == 0) {
                        grid[r - 1][c] = 1;
                        q.add(new int[] { r - 1, c });
                    }
                    if (c < n - 1) {
                        if (grid[r - 1][c + 1] == 0) {
                            grid[r - 1][c + 1] = 1;
                            q.add(new int[] { r - 1, c + 1 });
                        }
                    }
                }
                if (c > 0) {
                    if (grid[r][c - 1] == 0) {
                        grid[r][c - 1] = 1;
                        q.add(new int[] { r, c - 1 });
                    }
                }
                if (c < n - 1) {
                    if (grid[r][c + 1] == 0) {
                        grid[r][c + 1] = 1;
                        q.add(new int[] { r, c + 1 });
                    }
                }
                if (r < n - 1) {
                    if (c > 0) {
                        if (grid[r + 1][c - 1] == 0) {
                            grid[r + 1][c - 1] = 1;
                            q.add(new int[] { r + 1, c - 1 });
                        }
                    }
                    if (grid[r + 1][c] == 0) {
                        grid[r + 1][c] = 1;
                        q.add(new int[] { r + 1, c });
                    }
                    if (c < n - 1) {
                        if (grid[r + 1][c + 1] == 0) {
                            grid[r + 1][c + 1] = 1;
                            q.add(new int[] { r + 1, c + 1 });
                        }
                    }
                }
            }

            if (!q.isEmpty())
                len++;
        }

        if (min == (int) 1e5)
            return -1;
        return min;
    }
}