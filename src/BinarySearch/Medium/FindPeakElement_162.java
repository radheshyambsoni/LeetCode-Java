package BinarySearch.Medium;

// 162. Find Peak Element - Medium
// https://leetcode.com/problems/find-peak-element/
// Runtime 0 ms Beats 100%
// Memory 41 MB Beats 80.13%
// Aug 25, 2023

public class FindPeakElement_162 {
    public int findPeakElement(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return 0;
        if (arr[0] > arr[1])
            return 0;
        if (arr[n - 1] > arr[n - 2])
            return n - 1;

        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1])
                return mid;

            if (arr[mid] > arr[mid - 1])
                low = mid + 1;
            else {
                high = mid - 1;
            }
        }

        return -1;
    }
}