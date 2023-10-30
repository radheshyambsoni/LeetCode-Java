package BitManipulation.Easy;

import java.util.Arrays;

// 1356. Sort Integers by The Number of 1 Bits
// https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/
// Runtime 3ms Beats 99.13%
// Memory 43.57 MB Beats 79.38%
// Oct 30, 2023

public class SortIntegersByTheNumOf1Bits_1356 {
    public int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += Integer.bitCount(arr[i]) * 10001;
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            arr[i] %= 10001;
        }

        return arr;
    }
}