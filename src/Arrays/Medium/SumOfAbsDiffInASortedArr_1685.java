package Arrays.Medium;

// 1685. Sum of Absolute Differences in a Sorted Array
// https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/
// Runtime 3 ms Beats 99.36%
// Memory 59.28 MB Beats 38.46%
// Nov 25, 2023

public class SumOfAbsDiffInASortedArr_1685 {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] ans = new int[nums.length];
        int sufSum = 0;
        for (int num : nums) {
            sufSum += num;
        }

        int preSum = 0;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = (sufSum - nums[i] * (nums.length - i)) + (nums[i] * i - preSum);
            preSum += nums[i];
            sufSum -= nums[i];
        }

        return ans;
    }
}