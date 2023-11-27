package DP.Medium;

// 935. Knight Dialer
// https://leetcode.com/problems/knight-dialer/
// Runtime 37 ms Beats 56.25%
// Memory 43.55 MB Beats 52.99%
// Nov 27, 2023

public class KnightDialer_935 {
    int MOD = (int) 1e9 + 7;

    public int f(int[][] moves, int n, int num, int[][] dp) {
        if (n == 0) {
            return 1;
        }

        if (dp[n][num] != 0) {
            return dp[n][num];
        }

        int ans = 0;
        for (int next : moves[num]) {
            ans = (ans + f(moves, n - 1, next, dp)) % MOD;
        }

        return dp[n][num] = ans;
    }

    public int knightDialer(int n) {
        if (n == 1) {
            return 10;
        }

        int[][] moves = { { 4, 6 }, { 6, 8 }, { 7, 9 }, { 4, 8 }, { 0, 3, 9 }, {}, { 0, 1, 7 }, { 2, 6 }, { 1, 3 },
                { 2, 4 } };

        int ans = 0;
        int[][] dp = new int[n + 1][10];
        for (int num = 0; num <= 9; num++) {
            ans = (ans + f(moves, n - 1, num, dp)) % MOD;
        }

        return ans;
    }
}