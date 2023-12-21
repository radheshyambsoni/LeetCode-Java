package Arrays.Medium;

import java.util.Arrays;

// 1637. Widest Vertical Area Between Two Points Containing No Points
// https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/
// Runtime 13 ms Beats 98.08%
// Memory 73.28 MB Beats 5.00%
// Dec 21, 2023

public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints_1637 {
    public int maxWidthOfVerticalArea(int[][] points) {
        int n = points.length;
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = points[i][0];
        }

        Arrays.sort(x);
        int max = 0;
        for (int i = 1; i < n; i++) {
            max = Math.max(max, x[i] - x[i - 1]);
        }

        return max;
    }
}