package DP.Medium;

// import java.util.Arrays;

// 486. Predict the Winner
// https://leetcode.com/problems/predict-the-winner/
// Runtime 0 ms Beats 100%
// Memory 39.9 MB Beats 77.43%
// Jul 28, 2023

// Space Optimization
public class PredictTheWinner_486 {
    public boolean PredictTheWinner(int[] nums) {
        int[] dp = new int[nums.length];
        // base case
        for (int i = 0; i < nums.length; i++)
            dp[i] = nums[i];

        for (int diff = 1; diff < nums.length; diff++) {
            for (int i = 0; i < nums.length - diff; i++) {
                int j = i + diff;
                dp[i] = Math.max(nums[i] - dp[i + 1], nums[j] - dp[i]);
            }
        }

        return dp[0] >= 0;
    }
}

// // Tabulation
// // Runtime 0 ms Beats 100%
// // Memory 39.6 MB Beats 96.57%
// public class PredictTheWinner_486 {
// public boolean PredictTheWinner(int[] nums) {
// int[][] dp = new int[nums.length][nums.length];
// // base case
// for (int i = 0; i < nums.length; i++)
// dp[i][i] = nums[i];

// for (int diff = 1; diff < nums.length; diff++) {
// for (int i = 0; i < nums.length - diff; i++) {
// int j = i + diff;
// dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
// }
// }

// return dp[0][nums.length - 1] >= 0;
// }
// }

// // memoization
// // Runtime 0 ms Beats 100%
// // Memory 39.9 MB Beats 66.81%

// public class PredictTheWinner_486 {
// int f(int[] nums, int i, int j, int[][] dp) {
// if (i == j)
// return nums[i];

// if (dp[i][j] != -1)
// return dp[i][j];

// int left = nums[i] - f(nums, i + 1, j, dp);
// int right = nums[j] - f(nums, i, j - 1, dp);

// return dp[i][j] = Math.max(left, right);
// }

// public boolean PredictTheWinner(int[] nums) {
// int[][] dp = new int[nums.length][nums.length];
// for (int[] arr : dp)
// Arrays.fill(arr, -1);
// return f(nums, 0, nums.length - 1, dp) >= 0;
// }
// }