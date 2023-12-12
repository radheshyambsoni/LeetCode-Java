package Arrays.Easy;

// 1464. Maximum Product of Two Elements in an Array
// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
// Runtime 0 ms Beats 100.00%
// Memory 41.97 MB Beats 33.98%
// Dec 12, 2023

public class MaxProdOfTwoElementsInAnArr_1464 {
    public int maxProduct(int[] nums) {
        int max = 0, secondMax = 0;
        for (int num : nums) {
            if (num >= max) {
                secondMax = max;
                max = num;
            } else if (num >= secondMax) {
                secondMax = num;
            }
        }

        return (max - 1) * (secondMax - 1);
    }
}