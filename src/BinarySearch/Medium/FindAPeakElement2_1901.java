package BinarySearch.Medium;

// 1901. Find a Peak Element II
// https://leetcode.com/problems/find-a-peak-element-ii/
// Runtime 0 ms Beats 100%
// Memory 82.1 MB Beats 9.42%
// Jul 25, 2023

public class FindAPeakElement2_1901 {
    public int[] findPeakGrid(int[][] mat) {
        int startCol = 0, endCol = mat[0].length - 1;

        while (startCol <= endCol) {
            int maxRow = 0, midCol = startCol + (endCol - startCol) / 2;

            for (int row = 0; row < mat.length; row++) {
                maxRow = mat[row][midCol] >= mat[maxRow][midCol] ? row : maxRow;
            }

            boolean leftIsBig = midCol - 1 >= startCol && mat[maxRow][midCol - 1] > mat[maxRow][midCol];
            boolean rightIsBig = midCol + 1 <= endCol && mat[maxRow][midCol + 1] > mat[maxRow][midCol];

            if (!leftIsBig && !rightIsBig)
                return new int[] { maxRow, midCol };
            else if (rightIsBig)
                startCol = midCol + 1;
            else
                endCol = midCol - 1;
        }
        return null;
    }
}