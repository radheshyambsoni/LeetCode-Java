package DP.Medium;

import java.util.Arrays;

// 650. 2 Keys Keyboard
// https://leetcode.com/problems/2-keys-keyboard/
// Runtime 21 ms Beats 22.99%
// Memory 53.21 MB Beats 15.17%
// Nov 18, 2023

public class TwoKeysKeyboard_650 {
    int f(int n, int curr, int lastCopied, int[][] dp) {
        if (curr >= n) {
            if (curr == n)
                return 0;
            return (int) 1e9;
        }

        if (dp[curr][lastCopied] != -1) {
            return dp[curr][lastCopied];
        }

        int copy = lastCopied != curr ? 1 + f(n, curr, curr, dp) : (int) 1e9;
        int paste = lastCopied != 0 ? 1 + f(n, curr + lastCopied, lastCopied, dp) : (int) 1e9;

        return dp[curr][lastCopied] = Math.min(copy, paste);
    }

    public int minSteps(int n) {
        if (n == 1)
            return 0;

        int[][] dp = new int[n + 1][n + 1];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }

        return f(n, 1, 0, dp);
    }
}