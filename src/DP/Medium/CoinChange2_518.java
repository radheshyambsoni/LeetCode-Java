package DP.Medium;

import java.util.Arrays;

// 518. Coin Change II
// https://leetcode.com/problems/coin-change-ii/
// Runtime 4 ms Beats 68.68%
// Memory 45.6 MB Beats 40.21%
// Aug 13, 2023

// Memoization
public class CoinChange2_518 {
    // memoization
    int f(int[] coins, int idx, int tar, int[][] dp) {
        if (tar == 0)
            return 1;
        if (idx == 0) {
            return tar % coins[0] == 0 ? 1 : 0;
        }
        if (dp[idx][tar] != -1)
            return dp[idx][tar];

        int notTake = f(coins, idx - 1, tar, dp);
        int take = coins[idx] <= tar ? f(coins, idx, tar - coins[idx], dp) : 0;

        return dp[idx][tar] = take + notTake;
    }

    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        for (int[] arr : dp)
            Arrays.fill(arr, -1);
        return f(coins, coins.length - 1, amount, dp);
    }
}

// 1D array space optimization
// Runtime 5 ms Beats 62.25%
// Memory 40.5 MB Beats 65.59%
// public class CoinChange2_518 {
// public int change(int amount, int[] coins) {
// int n = coins.length;
// int[] cur = new int[amount+1];

// cur[0] = 1;
// for(int tar=1;tar<=amount;tar++) {
// if(tar%coins[0] == 0) cur[tar] = 1;
// }

// for(int idx=1;idx<n;idx++){
// for(int tar=1;tar<=amount;tar++){
// int notTake = cur[tar];
// int take = (coins[idx] <= tar) ? cur[tar - coins[idx]] : 0;
// cur[tar] = take + notTake;
// }
// }

// return cur[amount];
// }
// }

// Space optimization
// Runtime 6 ms Beats 57.98%
// Memory 43.4 MB Beats 61.27%
// public class CoinChange2_518 {
// public int change(int amount, int[] coins) {
// int n = coins.length;
// int[] prev = new int[amount + 1];

// prev[0] = 1;
// for (int tar = 1; tar <= amount; tar++) {
// if (tar % coins[0] == 0)
// prev[tar] = 1;
// }

// for (int idx = 1; idx < n; idx++) {
// int[] cur = new int[amount + 1];
// cur[0] = 1;
// for (int tar = 1; tar <= amount; tar++) {
// int notTake = prev[tar];
// int take = (coins[idx] <= tar) ? cur[tar - coins[idx]] : 0;
// cur[tar] = take + notTake;
// }
// prev = cur;
// }

// return prev[amount];
// }
// }

// Tabulation
// Runtime 6 ms Beats 57.98%
// Memory 46.6 MB Beats 7.17%
// public class CoinChange2_518 {
// public int change(int amount, int[] coins) {
// int n = coins.length;
// int[][] dp = new int[n][amount+1];

// for(int[] arr: dp) arr[0] = 1;
// for(int tar=1;tar<=amount;tar++) {
// if(tar%coins[0] == 0) dp[0][tar] = 1;
// }

// for(int idx=1;idx<n;idx++){
// for(int tar=1;tar<=amount;tar++){
// int notTake = dp[idx-1][tar];
// int take = (coins[idx] <= tar) ? dp[idx][tar - coins[idx]] : 0;
// dp[idx][tar] = take + notTake;
// }
// }

// return dp[n - 1][amount];
// }
// }