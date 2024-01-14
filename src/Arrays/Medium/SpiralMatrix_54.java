package Arrays.Medium;

import java.util.ArrayList;
import java.util.List;

// 54. Spiral Matrix
// https://leetcode.com/problems/spiral-matrix/
// Runtime 0 ms Beats 100.00%
// Memory 41.10 MB Beats 55.11%
// Jan 14, 2024

public class SpiralMatrix_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int size = matrix.length * matrix[0].length;
        int rowStart = 0, colStart = 0, rowEnd = matrix.length, colEnd = matrix[0].length;
        int i = 0, j = 0;
        while (true) {
            while (j < colEnd && ans.size() != size) {
                ans.add(matrix[i][j++]);
            }
            if (ans.size() == size) {
                break;
            }
            j--;
            i++;
            rowStart++;

            while (i < rowEnd && ans.size() != size) {
                ans.add(matrix[i++][j]);
            }
            if (ans.size() == size) {
                break;
            }
            i--;
            j--;
            colEnd--;

            while (j >= colStart && ans.size() != size) {
                ans.add(matrix[i][j--]);
            }
            if (ans.size() == size) {
                break;
            }
            j++;
            i--;
            rowEnd--;

            while (i >= rowStart && ans.size() != size) {
                ans.add(matrix[i--][j]);
            }
            if (ans.size() == size) {
                break;
            }
            i++;
            j++;
            colStart++;
        }

        return ans;
    }
}
// 1 2 3 11
// 4 5 6 12
// 7 8 9 13
// 21 22 23 24