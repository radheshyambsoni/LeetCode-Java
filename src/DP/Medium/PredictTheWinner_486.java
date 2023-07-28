package DP.Medium;

import java.util.Arrays;

// 486. Predict the Winner
// https://leetcode.com/problems/predict-the-winner/
// Runtime 0 ms Beats 100%
// Memory 39.9 MB Beats 66.81%
// Jul 28, 2023

public class PredictTheWinner_486 {
    int f(int[] nums, int i, int j, int[][] dp) {
        if (i == j)
            return nums[i];

        if (dp[i][j] != -1)
            return dp[i][j];

        int left = nums[i] - f(nums, i + 1, j, dp);
        int right = nums[j] - f(nums, i, j - 1, dp);

        return dp[i][j] = Math.max(left, right);
    }

    public boolean PredictTheWinner(int[] nums) {
        int[][] dp = new int[nums.length][nums.length];
        for (int[] arr : dp)
            Arrays.fill(arr, -1);
        return f(nums, 0, nums.length - 1, dp) >= 0;
    }
}