package Arrays.Medium;

// 807. Max Increase to Keep City Skyline
// https://leetcode.com/problems/max-increase-to-keep-city-skyline/
// Runtime 0 ms Beats 100.00%
// Memory 43.94 MB Beats 15.73%
// Dec 27, 2023

public class MaxIncreaseToKeepCitySkyline_807 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int[] rowMax = new int[n];
        int[] colMax = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowMax[i] = Math.max(rowMax[i], grid[i][j]);
                colMax[j] = Math.max(colMax[j], grid[i][j]);
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int rMax = rowMax[i];
            for (int j = 0; j < n; j++) {
                sum += Math.min(rMax, colMax[j]) - grid[i][j];
            }
        }

        return sum;
    }
}