package Arrays.Medium;

// 152. Maximum Product Subarray
// https://leetcode.com/problems/maximum-product-subarray/
// Runtime 1 ms Beats 85.90%
// Memory 43 MB Beats 95.70%
// Aug 20, 2023

public class MaxProdSubarr_152 {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, pre = 1, suf = 1, n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (pre == 0)
                pre = 1;
            if (suf == 0)
                suf = 1;

            pre *= nums[i];
            suf *= nums[n - i - 1];
            max = Math.max(max, Math.max(pre, suf));
        }

        return max;
    }
}