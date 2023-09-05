package DP.Medium;

import java.util.Arrays;

// 678. Valid Parenthesis String
// https://leetcode.com/problems/valid-parenthesis-string/
// Runtime 2 ms Beats 6.78%
// Memory 41.5 MB Beats 5.71%
// Sep 05, 2023

public class ValidParenthesisString_678 {
    int f(String s, int idx, int sign, int[][] dp) {
        if (idx == s.length())
            return sign == 0 ? 1 : 0;

        if (dp[idx][sign] != -1)
            return dp[idx][sign];

        if (s.charAt(idx) == '*') {
            int empty = f(s, idx + 1, sign, dp);
            int open = f(s, idx + 1, sign + 1, dp);
            int close = sign > 0 ? f(s, idx + 1, sign - 1, dp) : 0;

            return dp[idx][sign] = ((empty == 1) | (open == 1) | (close == 1)) ? 1 : 0;
        }

        if (s.charAt(idx) == '(') {
            return dp[idx][sign] = f(s, idx + 1, sign + 1, dp);
        }

        return dp[idx][sign] = sign <= 0 ? 0 : f(s, idx + 1, sign - 1, dp);
    }

    public boolean checkValidString(String s) {
        int[][] dp = new int[s.length() + 1][s.length() + 1];

        for (int[] arr : dp)
            Arrays.fill(arr, -1);

        return f(s, 0, 0, dp) == 1;
    }
}