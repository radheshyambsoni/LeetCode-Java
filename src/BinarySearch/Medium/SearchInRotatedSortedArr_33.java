package BinarySearch.Medium;

// 33. Search in Rotated Sorted Array
// https://leetcode.com/problems/search-in-rotated-sorted-array/
// Runtime 0 ms Beats 100%
// Memory 41.2 MB Beats 28.50%
// Aug 23, 2023

public class SearchInRotatedSortedArr_33 {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target)
                return mid;
            // if left portion is sorted
            if (nums[low] <= nums[mid]) {
                // if the current portion contains the target
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                }
                // if the current portion does not contain the target
                else {
                    low = mid + 1;
                }
            }
            // if right portion is sorted
            else {
                // if the current portion contains the target
                if (nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;
                }
                // if the current portion does not contain the target
                else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}