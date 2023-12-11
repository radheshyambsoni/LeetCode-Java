package Arrays.Easy;

// 1287. Element Appearing More Than 25% In Sorted Array
// https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/
// Runtime 0 ms Beats 100.00%
// Memory 43.40 MB Beats 58.02%
// Dec 11, 2023

public class ElementAppearingMoreThan25InSortedArr_1287 {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length, cnt = 1, prev = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] == prev) {
                cnt++;
            } else {
                cnt = 1;
            }

            if (cnt > n / 4) {
                return arr[i];
            }

            prev = arr[i];
        }

        return prev;
    }
}