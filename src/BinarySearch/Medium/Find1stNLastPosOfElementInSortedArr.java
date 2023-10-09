package BinarySearch.Medium;

// 34. Find First and Last Position of Element in Sorted Array
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// Runtime 0 ms Beats 100%
// Memory 44.4 MB Beats 54.18%
// Sep 09, 2023

public class Find1stNLastPosOfElementInSortedArr {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = { -1, -1 };
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);
        return ans;
    }

    int search(int[] nums, int target, boolean startOrEnd) {
        int ans = -1, start = 0, end = nums.length - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (target < nums[mid]) {
                end = mid - 1;
                mid = start + (end - start) / 2;
            } else if (target > nums[mid]) {
                start = mid + 1;
                mid = start + (end - start) / 2;
            } else {
                ans = mid;
                if (startOrEnd) {
                    end = mid - 1;
                    mid = start + (end - start) / 2;
                } else {
                    start = mid + 1;
                    mid = start + (end - start) / 2;
                }
            }
        }

        return ans;
    }
}