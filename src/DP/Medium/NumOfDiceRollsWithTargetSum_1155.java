package DP.Medium;

import java.util.Arrays;

// 1155. Number of Dice Rolls With Target Sum
// https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/
// Runtime 8 ms Beats 89.12%
// Memory 41.40 MB Beats 29.28%
// Nov 24, 2023

public class NumOfDiceRollsWithTargetSum_1155 {
    int MOD = (int) 1e9 + 7;

    int f(int n, int k, int t, int[][] dp) {
        if (t == 0) {
            return 0;
        }
        if (n == 1) {
            return t <= k ? 1 : 0;
        }

        if (dp[n][t] != -1) {
            return dp[n][t];
        }

        int ways = 0;
        for (int i = 1; i <= k; i++) {
            if (i >= t)
                break;
            ways = (ways + f(n - 1, k, t - i, dp)) % MOD;
        }

        return dp[n][t] = ways;
    }

    public int numRollsToTarget(int n, int k, int target) {
        int[][] dp = new int[n + 1][target + 1];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        return f(n, k, target, dp);
    }
}