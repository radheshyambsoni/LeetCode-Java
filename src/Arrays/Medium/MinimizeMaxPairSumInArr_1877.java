package Arrays.Medium;

import java.util.Arrays;

// 1877. Minimize Maximum Pair Sum in Array
// https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/
// Runtime 54 ms Beats 54.80%
// Memory 57.93 MB Beats 8.14%
// Nov 17, 2023

public class MinimizeMaxPairSumInArr_1877 {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = 0, n = nums.length;
        for (int i = 0; i < n / 2; i++) {
            max = Math.max(max, nums[i] + nums[n - i - 1]);
        }

        return max;
    }
}