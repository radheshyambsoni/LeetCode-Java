package DP.Medium;

import java.util.Arrays;

// 808. Soup Servings
// https://leetcode.com/problems/soup-servings/
// Runtime 0 ms Beats 100%
// Memory 39 MB Beats 100%
// Jul 29, 2023

public class SoupServings_808 {
    double f(int a, int b, double[][] dp) {
        if (a <= 0 && b <= 0) {
            return 0.5;
        }
        if (a <= 0) {
            return 1.0;
        }
        if (b <= 0) {
            return 0.0;
        }

        if (dp[a][b] != -1) {
            return dp[a][b];
        }

        return dp[a][b] = 0.25 * (f(a - 4, b, dp) + f(a - 3, b - 1, dp) + f(a - 2, b - 2, dp) + f(a - 1, b - 3, dp));
    }

    public double soupServings(int n) {
        if (n > 4800)
            return 1;
        n = (n + 24) / 25;
        double[][] dp = new double[n + 1][n + 1];
        for (double[] arr : dp)
            Arrays.fill(arr, -1);
        return f(n, n, dp);
    }
}