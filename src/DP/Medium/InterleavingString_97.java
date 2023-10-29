package DP.Medium;

// 97. Interleaving String
// https://leetcode.com/problems/interleaving-string/
// Runtime 7 ms Beats 31.98%
// Memory 56.49 MB Beats 5.17%
// Oct 29, 2023

public class InterleavingString_97 {
    boolean f(String s1, String s2, String s3, int idx, int i, int j, Boolean[][][] dp) {
        if (idx == s3.length()) {
            if (i == s1.length() && j == s2.length())
                return true;
            return false;
        }

        if (i < s1.length() && j < s2.length() && dp[idx][i][j] != null) {
            return dp[idx][i][j];
        }

        boolean left = false;
        if (i < s1.length() && s1.charAt(i) == s3.charAt(idx)) {
            left = f(s1, s2, s3, idx + 1, i + 1, j, dp);
        }

        boolean right = false;
        if (j < s2.length() && s2.charAt(j) == s3.charAt(idx)) {
            right = f(s1, s2, s3, idx + 1, i, j + 1, dp);
        }

        return dp[idx][i][j] = left | right;
    }

    public boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length(), n = s2.length(), k = s3.length();
        if ((m + n) != k)
            return false;

        Boolean[][][] dp = new Boolean[k + 1][m + 1][n + 1];
        return f(s1, s2, s3, 0, 0, 0, dp);
    }
}