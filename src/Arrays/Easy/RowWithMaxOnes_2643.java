package Arrays.Easy;

// 2643. Row With Maximum Ones
// https://leetcode.com/problems/row-with-maximum-ones/
// Runtime 1 ms Beats 100%
// Memory 44.9 MB Beats 29.26%
// Sep 17, 2023

public class RowWithMaxOnes_2643 {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max = -1, idx = -1;
        for (int i = 0; i < mat.length; i++) {
            int cnt = 0;
            for (int j = 0; j < mat[0].length; j++) {
                cnt += mat[i][j];
            }
            if (cnt > max) {
                max = cnt;
                idx = i;
            }
        }

        return new int[] { idx, max };
    }
}