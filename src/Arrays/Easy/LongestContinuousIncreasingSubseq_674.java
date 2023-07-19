package Arrays.Easy;

// 674. Longest Continuous Increasing Subsequence
// https://leetcode.com/problems/longest-continuous-increasing-subsequence/
// Runtime 1 ms Beats 98.63%
// Memory 44 MB Beats 53.97%
// July 19, 2023

public class LongestContinuousIncreasingSubseq_674 {
    public int findLengthOfLCIS(int[] nums) {
        int max = 1;
        int cnt = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                cnt++;
                max = Math.max(max, cnt);
            } else {
                cnt = 1;
            }
        }
        return max;
    }
}