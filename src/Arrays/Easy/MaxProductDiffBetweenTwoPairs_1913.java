package Arrays.Easy;

// 1913. Maximum Product Difference Between Two Pairs
// https://leetcode.com/problems/maximum-product-difference-between-two-pairs
// Runtime 2 ms Beats 97.51%
// Memory 44.47 MB Beats 28.04%
// Dec 18, 2023

public class MaxProductDiffBetweenTwoPairs_1913 {
    public int maxProductDifference(int[] nums) {
        int small = 100000, secondSmall = 100000, big = 0, secondBig = 0;
        for (int num : nums) {
            if (small > num) {
                secondSmall = small;
                small = num;
            } else if (secondSmall > num) {
                secondSmall = num;
            }

            if (big < num) {
                secondBig = big;
                big = num;
            } else if (secondBig < num) {
                secondBig = num;
            }
        }

        return big * secondBig - small * secondSmall;
    }
}