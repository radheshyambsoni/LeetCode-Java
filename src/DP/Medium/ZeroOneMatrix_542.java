package DP.Medium;

// 542. 01 Matrix
// https://leetcode.com/problems/01-matrix/description/
// Runtime 6 ms Beats 98.51%
// Memory 45.8 MB Beats 58.97%
// Aug 17, 2023

public class ZeroOneMatrix_542 {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] ans = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = mat[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (ans[i][j] == 0)
                    continue;

                int minSteps = m * n;
                if (i > 0)
                    minSteps = Math.min(minSteps, ans[i - 1][j]);
                if (j > 0)
                    minSteps = Math.min(minSteps, ans[i][j - 1]);
                ans[i][j] = minSteps + 1;
            }
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (ans[i][j] == 0) {
                    continue;
                }

                int minSteps = m * n;

                if (i < m - 1) {
                    minSteps = Math.min(minSteps, ans[i + 1][j]);
                }
                if (j < n - 1) {
                    minSteps = Math.min(minSteps, ans[i][j + 1]);
                }

                ans[i][j] = Math.min(ans[i][j], minSteps + 1);
            }
        }

        return ans;
    }
}