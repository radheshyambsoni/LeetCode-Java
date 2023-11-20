package DP.Medium;

// import java.util.Arrays;

// 2466. Count Ways To Build Good Strings
// https://leetcode.com/problems/count-ways-to-build-good-strings/
// Runtime 8 ms Beats 65.41%
// Memory 43.41 MB Beats 39.41%
// Nov 20, 2023

public class CountWaysToBuildGoodStrings_2466 {
    // int MOD = (int)1e9 + 7;
    // int f(int zero, int one, int len, int[] dp){
    // if(len < 0)
    // return 0;
    // if(len == 0)
    // return 1;

    // if(dp[len] != -1)
    // return dp[len];

    // int notTake = f(zero, one, len - zero, dp);
    // int take = f(zero, one, len - one, dp);

    // return dp[len] = (notTake + take) % MOD;
    // }
    public int countGoodStrings(int low, int high, int zero, int one) {
        int MOD = (int) 1e9 + 7;
        int sum = 0;
        int[] dp = new int[high + 1];
        // Arrays.fill(dp, -1);
        // for(int len = low; len <= high; len++) {
        // sum = (sum + f(zero, one, len, dp))%MOD;
        // }

        dp[0] = 1;
        for (int i = 1; i <= high; i++) {
            if (i >= zero) {
                dp[i] = (dp[i] + dp[i - zero]) % MOD;
            }
            if (i >= one) {
                dp[i] = (dp[i] + dp[i - one]) % MOD;
            }

            if (i >= low) {
                sum = (sum + dp[i]) % MOD;
            }
        }

        return sum;
    }
}