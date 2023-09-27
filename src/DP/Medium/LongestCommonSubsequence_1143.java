package DP.Medium;

import java.util.Arrays;

// 1143. Longest Common Subsequence
// https://leetcode.com/problems/longest-common-subsequence/
// Runtime 23 ms Beats 46.49%
// Memory 48.5 MB Beats 31.46%
// Sep 27, 2023

// memoization
public class LongestCommonSubsequence_1143 {
    int f(String s1, String s2, int idx1, int idx2, int[][] dp) {
        if (idx1 < 0 || idx2 < 0)
            return 0;

        if (dp[idx1][idx2] != -1)
            return dp[idx1][idx2];

        if (s1.charAt(idx1) == s2.charAt(idx2))
            return dp[idx1][idx2] = 1 + f(s1, s2, idx1 - 1, idx2 - 1, dp);

        return dp[idx1][idx2] = Math.max(f(s1, s2, idx1 - 1, idx2, dp), f(s1, s2, idx1, idx2 - 1, dp));
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        int[][] dp = new int[m][n];
        for (int[] arr : dp)
            Arrays.fill(arr, -1);

        return f(text1, text2, m - 1, n - 1, dp);
    }
}