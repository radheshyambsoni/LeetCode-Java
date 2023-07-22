package DP.Medium;

import java.util.Arrays;

// 688. Knight Probability in Chessboard
// https://leetcode.com/problems/knight-probability-in-chessboard/
// Runtime 4 ms Beats 99.19%
// Memory 40.7 MB Beats 92.14%
// Jul 22, 2023

public class KnightProbabilityInChessboard_688 {
    boolean posIsOnBoard(int r, int c, int n) {
        return r >= 0 && r < n && c >= 0 && c < n;
    }

    double f(int r, int c, int k, int n, double[][][] dp) {
        if (k == 0)
            return 1;

        if (dp[r][c][k] != -1.0)
            return dp[r][c][k];

        double onBoard = 0;

        if (posIsOnBoard(r - 2, c - 1, n))
            onBoard += f(r - 2, c - 1, k - 1, n, dp);
        if (posIsOnBoard(r - 2, c + 1, n))
            onBoard += f(r - 2, c + 1, k - 1, n, dp);
        if (posIsOnBoard(r - 1, c - 2, n))
            onBoard += f(r - 1, c - 2, k - 1, n, dp);
        if (posIsOnBoard(r - 1, c + 2, n))
            onBoard += f(r - 1, c + 2, k - 1, n, dp);
        if (posIsOnBoard(r + 1, c - 2, n))
            onBoard += f(r + 1, c - 2, k - 1, n, dp);
        if (posIsOnBoard(r + 1, c + 2, n))
            onBoard += f(r + 1, c + 2, k - 1, n, dp);
        if (posIsOnBoard(r + 2, c - 1, n))
            onBoard += f(r + 2, c - 1, k - 1, n, dp);
        if (posIsOnBoard(r + 2, c + 1, n))
            onBoard += f(r + 2, c + 1, k - 1, n, dp);

        return dp[r][c][k] = onBoard / 8;
    }

    public double knightProbability(int n, int k, int row, int column) {
        double[][][] board = new double[n][n][k + 1];
        for (double[][] mat : board) {
            for (double[] arr : mat)
                Arrays.fill(arr, -1.0);
        }
        return f(row, column, k, n, board);
    }
}