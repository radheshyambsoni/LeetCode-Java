package Arrays.Medium;

import java.util.Arrays;

// 1798. Maximum Number of Consecutive Values You Can Make
// https://leetcode.com/problems/maximum-number-of-consecutive-values-you-can-make/
// Runtime 17 ms Beats 93.88%
// Memory 52.51 MB Beats 12.25%
// Dec 03, 2023

public class MaxNumOfConsecutiveValuesYouCanMake_1798 {
    public int getMaximumConsecutive(int[] coins) {
        Arrays.sort(coins);
        int max = 0;
        for (int c : coins) {
            if (c > max + 1)
                break;
            max += c;
        }

        return max + 1;
    }
}