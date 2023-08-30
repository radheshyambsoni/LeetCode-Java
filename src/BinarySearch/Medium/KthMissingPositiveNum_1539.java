package BinarySearch.Medium;

// 1539. Kth Missing Positive Number
// https://leetcode.com/problems/kth-missing-positive-number/
// Runtime 0 ms Beats 100%
// Memory 42.5 MB Beats 44.83%
// Aug 30, 2023

public class KthMissingPositiveNum_1539 {
    public int findKthPositive(int[] arr, int k) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int missingCnt = arr[mid] - (mid + 1);
            if (missingCnt < k)
                low = mid + 1;
            else
                high = mid - 1;
        }

        // ans = arr[high] + more (more = (k - missingCnt))
        // ans = arr[high] + k - missingCnt (missingCnt = arr[high] - (high + 1))
        // ans = arr[high] + k - (arr[high] - (high + 1))
        // ans = arr[high] + k - arr[high] + high + 1;
        // ans = k + high + 1 (+ 1 = low after completion of BS)
        // ans = low + k
        return low + k;
    }
}