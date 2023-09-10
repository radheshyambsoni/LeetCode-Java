package Arrays.Medium;

// 1314. Matrix Block Sum
// https://leetcode.com/problems/matrix-block-sum/
// Runtime 4 ms Beats 92.57%
// Memory 44.7 MB Beats 56.23%
// Sep 11, 2023

public class MatrixBlockSum_1314 {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length, n = mat[0].length;
        int[][] ans = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int start = Math.max(j - k, 0);
                int end = Math.min(j + k, n - 1);
                int sum = 0;
                for (int l = start; l <= end; l++) {
                    sum += mat[i][l];
                }
                ans[i][j] = sum;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int start = Math.max(i - k, 0);
                int end = Math.min(i + k, m - 1);
                int sum = 0;
                for (int l = start; l <= end; l++) {
                    sum += ans[l][j];
                }
                mat[i][j] = sum;
            }
        }

        return mat;
    }
}