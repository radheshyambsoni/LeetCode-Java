package Arrays.Medium;

import java.util.Arrays;

// 1561. Maximum Number of Coins You Can Get
// https://leetcode.com/problems/maximum-number-of-coins-you-can-get/
// Runtime 27 ms Beats 98.94%
// Memory 54.74 MB Beats 58.20%
// Nov 24, 2023

public class MaxNumOfCoinsYouCanGet_1561 {
    public int maxCoins(int[] piles) {
        int coins = 0, n = piles.length;
        Arrays.sort(piles);
        // strategy is to make the choice of triplet such that bob gets the least
        // for ex. for first triplet we can pick two largest and the smallest one from
        // the available ones(for poor bob)
        // this way, we will have all the possible second largests for ourselves
        for (int i = n / 3; i < n; i += 2) {
            coins += piles[i];
        }

        return coins;
    }
}