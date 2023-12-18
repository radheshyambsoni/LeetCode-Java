package BackTracking.Easy;

// 1863. Sum of All Subset XOR Totals
// https://leetcode.com/problems/sum-of-all-subset-xor-totals/description/
// Runtime 0 ms Beats 100.00%
// Memory 40.04 MB Beats 42.99%
// Dec 18, 2023

public class SumOfAllSubsetXORTotals_1863 {
    void f(int[] nums, int idx, int xor, int[] sum) {
        if (idx == nums.length) {
            sum[0] += xor;
            return;
        }

        f(nums, idx + 1, xor, sum);
        f(nums, idx + 1, xor ^ nums[idx], sum);
    }

    public int subsetXORSum(int[] nums) {
        int[] ans = { 0 };
        f(nums, 0, 0, ans);

        return ans[0];
    }
}