package DP.Hard;

import java.util.Arrays;

// 1335. Minimum Difficulty of a Job Schedule
// https://leetcode.com/problems/minimum-difficulty-of-a-job-schedule/
// Runtime 11 ms Beats 38.26% 
// Memory 41.53 MB Beats 13.36%
// Dec 29, 2023

public class MinDifficultyOfAJobSchedule_1335 {
    int f(int[] jd, int idx, int d, int[][] dp) {
        if (idx == jd.length) {
            return d == 0 ? 0 : 1000000;
        }

        if (d == 0) {
            return 1000000;
        }

        if (dp[idx][d] != -1) {
            return dp[idx][d];
        }

        int minDiff = 1000000, max = -1;
        int maxIdx = jd.length - d + 1;
        for (int i = idx; i <= maxIdx && i < jd.length; i++) {
            max = Math.max(max, jd[i]);
            minDiff = Math.min(minDiff, max + f(jd, i + 1, d - 1, dp));
        }

        return dp[idx][d] = minDiff;
    }

    public int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length;
        if (d > n) {
            return -1;
        }

        int[][] dp = new int[n + 1][d + 1];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        return f(jobDifficulty, 0, d, dp);
    }
}