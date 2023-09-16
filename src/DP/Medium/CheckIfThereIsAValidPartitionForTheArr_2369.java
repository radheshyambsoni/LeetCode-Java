package DP.Medium;

// 2369. Check if There is a Valid Partition For The Array
// https://leetcode.com/problems/check-if-there-is-a-valid-partition-for-the-array/
// Runtime 7 ms Beats 86.73%
// Memory 62.2 MB Beats 26.10%

public class CheckIfThereIsAValidPartitionForTheArr_2369 {
    boolean f(int[] nums, int idx, Boolean[] dp) {
        if (idx < 0)
            return true;

        if (dp[idx] != null)
            return dp[idx];

        boolean one = (idx > 0 && nums[idx] == nums[idx - 1]) ? f(nums, idx - 2, dp) : false;
        boolean two = (idx > 1 && nums[idx] == nums[idx - 1] && nums[idx] == nums[idx - 2]) ? f(nums, idx - 3, dp)
                : false;
        boolean three = (idx > 1 && nums[idx] - nums[idx - 1] == 1 && nums[idx] - nums[idx - 2] == 2)
                ? f(nums, idx - 3, dp)
                : false;

        return dp[idx] = one | two | three;
    }

    public boolean validPartition(int[] nums) {
        int n = nums.length;
        Boolean[] dp = new Boolean[n];
        return f(nums, n - 1, dp);
    }
}