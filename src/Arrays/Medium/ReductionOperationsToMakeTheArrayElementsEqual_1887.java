package Arrays.Medium;

import java.util.Arrays;

// 1887. Reduction Operations to Make the Array Elements Equal
// https://leetcode.com/problems/reduction-operations-to-make-the-array-elements-equal/
// Runtime 33 ms Beats 92.11%
// Memory 55.18 MB Beats 30.92%
// Nov 19, 2023

public class ReductionOperationsToMakeTheArrayElementsEqual_1887 {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int cnt = 0, prev = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] != prev) {
                prev = nums[i];
                cnt += n - 1 - i;
            }
        }

        return cnt;
    }
}