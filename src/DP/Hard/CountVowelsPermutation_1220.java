package DP.Hard;

import java.util.Arrays;

// 1220. Count Vowels Permutation
// https://leetcode.com/problems/count-vowels-permutation/
// Runtime 13ms Beats 62.05%
// Memory 44.76MB Beats 29.37% 
// Oct 28, 2023

public class CountVowelsPermutation_1220 {
    int f(int n, int a, int[][] dp) {
        if (n == 0) {
            return 1;
        }

        if (a != 0 && dp[a][n] != -1) {
            return dp[a][n];
        }

        long cnt = 0;
        if (a == 0) {
            for (int i = 1; i <= 5; i++) {
                cnt += f(n - 1, i, dp);
            }
        } else if (a == 1) {
            cnt = f(n - 1, 2, dp);
        } else if (a == 2) {
            cnt = f(n - 1, 1, dp) + f(n - 1, 3, dp);
        } else if (a == 3) {
            for (int i = 1; i <= 5; i++) {
                if (i == 3) {
                    continue;
                }
                cnt += f(n - 1, i, dp);
            }
        } else if (a == 4) {
            cnt = f(n - 1, 3, dp) + f(n - 1, 5, dp);
        } else if (a == 5) {
            cnt = f(n - 1, 1, dp);
        }

        return dp[a][n] = (int) (cnt % (int) (1e9 + 7));
    }

    public int countVowelPermutation(int n) {
        int[][] dp = new int[6][n + 1];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }

        return f(n, 0, dp);
    }
}