package Arrays.Medium;

import java.util.Arrays;

// 1846. Maximum Element After Decreasing and Rearranging
// https://leetcode.com/problems/maximum-element-after-decreasing-and-rearranging/
// Runtime 6 ms Beats 82.14%
// Memory 56.68 MB Beats 25.00%
// Nov 15, 2023

public class MaxElementAfterDecreasingAndRearranging_1846 {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] > 1) {
                arr[i] = arr[i - 1] + 1;
            }
        }

        return arr[arr.length - 1];
    }
}