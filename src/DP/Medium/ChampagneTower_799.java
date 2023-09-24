package DP.Medium;

// 799. Champagne Tower
// https://leetcode.com/problems/champagne-tower/
// Runtime 2 ms Beats 98.73%
// Memory 42.9 MB Beats 85.22%
// Sep 24, 2023

// Tabulation
public class ChampagneTower_799 {
    public double champagneTower(int poured, int query_row, int query_glass) {
        if (poured == 0)
            return 0;

        int r = query_row, c = query_glass;
        double[][] dp = new double[r + 1][];
        dp[0] = new double[] { poured };
        for (int i = 1; i <= r; i++) {
            dp[i] = new double[i + 1];
            dp[i][0] = dp[i - 1][0] > 1 ? ((dp[i - 1][0] - 1) / 2) : 0;
            for (int j = 1; j <= i / 2; j++) {
                double v1 = dp[i - 1][j - 1] > 1 ? ((dp[i - 1][j - 1] - 1) / 2) : 0;
                double v2 = dp[i - 1][j] > 1 ? ((dp[i - 1][j] - 1) / 2) : 0;
                dp[i][j] = v1 + v2;
                dp[i][i - j] = v1 + v2;
            }
            dp[i][i] = dp[i][0];
        }

        return dp[r][c] > 1 ? 1.0 : dp[r][c];
    }
}