package Arrays.Medium;

import java.util.Arrays;

// 1727. Largest Submatrix With Rearrangements
// https://leetcode.com/problems/largest-submatrix-with-rearrangements/
// Runtime 9 ms Beats 96.39%
// Memory 67.27 MB Beats 60.24%
// Nov 26, 2023

public class LargestSubmatrixWithRearrangements_1727 {
    public int largestSubmatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        for (int i = 1; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (matrix[i][j] == 1) {
                    matrix[i][j] = matrix[i - 1][j] + 1;
                }
            }
        }
        int ans = 0;
        for (int[] row : matrix) {
            Arrays.sort(row);
            for (int j = n - 1; j >= 0 && row[j] > 0; --j) {
                int s = row[j] * (n - j);
                ans = Math.max(ans, s);
            }
        }

        return ans;
    }
}