package DP.Medium;

import java.util.Arrays;

// 343. Integer Break
// https://leetcode.com/problems/integer-break/
// Runtime 0 ms Beats 100%
// Memory 39.1 MB Beats 51.27%
// Oct 06, 2023

public class IntegerBreak_343 {
    int f(int n, int[] dp) {
        if (n == 0)
            return 1;

        if (dp[n] != -1)
            return dp[n];

        int max = 0;
        for (int i = 1; i <= n; i++) {
            max = Math.max(max, i * f(n - i, dp));
        }

        return dp[n] = max;
    }

    public int integerBreak(int n) {
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return f(n, dp);
    }
}