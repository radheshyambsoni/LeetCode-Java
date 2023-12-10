package Arrays.Easy;

// 867. Transpose Matrix
// https://leetcode.com/problems/transpose-matrix/
// Runtime 0 ms Beats 100.00%
// Memory 44.79 MB Beats 14.98%
// Dec 10, 2023

public class TransposeMatrix_867 {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int ans[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
}