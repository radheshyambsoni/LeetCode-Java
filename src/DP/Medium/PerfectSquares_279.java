package DP.Medium;

import java.util.Arrays;

// 279. Perfect Squares
// https://leetcode.com/problems/perfect-squares/
// Runtime 61 ms Beats 39.72%
// Memory 42.83 MB Beats 49.27%
// Feb 08, 2024

public class PerfectSquares_279 {
    int f(int n, int[] dp) {
        if (n <= 0) {
            return n == 0 ? 0 : (int) 1e5;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        int ans = (int) 1e5;
        for (int i = 1; i * i <= n; i++) {
            ans = Math.min(ans, 1 + f(n - i * i, dp));
        }

        return dp[n] = ans;
    }

    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return f(n, dp);
    }
}