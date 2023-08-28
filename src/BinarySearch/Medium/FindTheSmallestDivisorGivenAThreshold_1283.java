package BinarySearch.Medium;

// 1283. Find the Smallest Divisor Given a Threshold
// https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
// Runtime 11 ms Beats 86.70%
// Memory 47.7 MB Beats 5.7%
// Aug 28, 2023

public class FindTheSmallestDivisorGivenAThreshold_1283 {
    int sumOfDiv(int[] nums, int div) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            sum += nums[i] / div;
            sum += nums[i] % div == 0 ? 0 : 1;
        }

        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = -1;
        for (int num : nums)
            high = Math.max(high, num);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sumOfDiv(nums, mid) <= threshold)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return low;
    }
}