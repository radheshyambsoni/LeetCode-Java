package DP.Medium;

// import java.util.Arrays;

// 1143. Longest Common Subsequence
// https://leetcode.com/problems/longest-common-subsequence/
// Runtime 22 ms Beats 55.73%
// Memory 48.3 MB Beats 56.74%
// Sep 27, 2023

// tabulation
public class LongestCommonSubsequence_1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        return dp[m][n];
    }
}

// Runtime 23 ms Beats 46.49%
// Memory 48.5 MB Beats 31.46%
// memoization
// public class LongestCommonSubsequence_1143 {
// int f(String s1, String s2, int idx1, int idx2, int[][] dp) {
// if (idx1 < 0 || idx2 < 0)
// return 0;

// if (dp[idx1][idx2] != -1)
// return dp[idx1][idx2];

// if (s1.charAt(idx1) == s2.charAt(idx2))
// return dp[idx1][idx2] = 1 + f(s1, s2, idx1 - 1, idx2 - 1, dp);

// return dp[idx1][idx2] = Math.max(f(s1, s2, idx1 - 1, idx2, dp), f(s1, s2,
// idx1, idx2 - 1, dp));
// }

// public int longestCommonSubsequence(String text1, String text2) {
// int m = text1.length(), n = text2.length();
// int[][] dp = new int[m][n];
// for (int[] arr : dp)
// Arrays.fill(arr, -1);

// return f(text1, text2, m - 1, n - 1, dp);
// }
// }