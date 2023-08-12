package DP.Medium;

// 322. Coin Change
// https://leetcode.com/problems/coin-change/
// Runtime 13 ms Beats 92.46%
// Memory 43.4 MB Beats 60.92%
// Aug 12, 2023

public class CoinChange_322 {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[] prev = new int[amount + 1];
        for (int tar = 0; tar <= amount; tar++) {
            prev[tar] = (tar % coins[0] == 0) ? (tar / coins[0]) : (int) 1e9;
        }

        for (int idx = 1; idx < n; idx++) {
            int[] cur = new int[amount + 1];
            for (int tar = 0; tar <= amount; tar++) {
                int notTake = prev[tar];
                int take = coins[idx] <= tar ? (1 + cur[tar - coins[idx]]) : (int) 1e9;
                cur[tar] = Math.min(notTake, take);
            }
            prev = cur;
        }

        int ans = prev[amount];
        if (ans >= (int) 1e9)
            return -1;
        return ans;
    }
}