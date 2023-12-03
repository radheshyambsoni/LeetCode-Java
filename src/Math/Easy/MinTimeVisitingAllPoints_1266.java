package Math.Easy;

// 1266. Minimum Time Visiting All Points
// https://leetcode.com/problems/minimum-time-visiting-all-points/
// Runtime 0 ms Beats 100.00%
// Memory 43.77 MB Beats 6.01%
// Dec 03, 2023

public class MinTimeVisitingAllPoints_1266 {
    int f(int[] p1, int[] p2) {
        int x = Math.abs(p2[0] - p1[0]);
        int y = Math.abs(p2[1] - p1[1]);
        return Math.max(x, y);
    }

    public int minTimeToVisitAllPoints(int[][] points) {
        int d = 0;
        for (int i = 1; i < points.length; i++) {
            d += f(points[i - 1], points[i]);
        }

        return d;
    }
}