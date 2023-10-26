package DP.Hard;

import java.util.Arrays;

// 1402. Reducing Dishes
// https://leetcode.com/problems/reducing-dishes/
// Runtime 15 ms Beats 22.02%
// Memory 43.44MB Beats 34.23%
// Oct 26, 2023

public class ReducingDishes_1402 {
    int f(int[] arr, int i, int t, int[][] dp) {
        if (i == arr.length) {
            return 0;
        }

        if (dp[i][t] != -1) {
            return dp[i][t];
        }

        int take = (t + 1) * arr[i] + f(arr, i + 1, t + 1, dp);
        int notTake = f(arr, i + 1, t, dp);

        return dp[i][t] = Math.max(take, notTake);
    }

    public int maxSatisfaction(int[] satisfaction) {
        int n = satisfaction.length;
        Arrays.sort(satisfaction);
        int[][] dp = new int[n][n];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        return f(satisfaction, 0, 0, dp);
    }
}