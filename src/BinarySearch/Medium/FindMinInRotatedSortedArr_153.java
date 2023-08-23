package BinarySearch.Medium;

// 153. Find Minimum in Rotated Sorted Array
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
// Runtime 0 ms Beats 100%
// Memory 40.6 MB Beats 81.89%
// Aug 23, 2023

public class FindMinInRotatedSortedArr_153 {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            // Little optimisation
            if (nums[low] <= nums[high]) {
                ans = Math.min(ans, nums[low]);
                break;
            }

            if (nums[low] <= nums[mid]) {
                ans = Math.min(ans, nums[low]);
                low = mid + 1;
            } else {
                ans = Math.min(ans, nums[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }
}

// // Runtime 0 ms Beats 100%
// // Memory 40.7 MB Beats 81.89%
// // Aug 23, 2023
// public class FindMinInRotatedSortedArr_153 {
// public int findMin(int[] nums) {
// int low = 0, high = nums.length - 1;
// int ans = Integer.MAX_VALUE;
// while (low <= high) {
// int mid = low + (high - low) / 2;
// if (nums[low] <= nums[mid]) {
// ans = Math.min(ans, nums[low]);
// low = mid + 1;
// } else {
// ans = Math.min(ans, nums[mid]);
// high = mid - 1;
// }
// }
// return ans;
// }
// }

// // Runtime 0 ms Beats 100%
// // Memory 42.9 MB Beats 19.87%
// public class FindMinInRotatedSortedArr {
// public int findMin(int[] nums) {
// if (nums[0] < nums[nums.length - 1]) {
// return nums[0];
// }
// int s = 0, e = nums.length - 1;
// while (s < e) {
// int m = s + (e - s) / 2;
// if (nums[m] < nums[0]) {
// e = m;
// } else {
// s = m + 1;
// }
// }
// return nums[e];
// }
// }