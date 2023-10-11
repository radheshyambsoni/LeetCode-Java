package BinarySearch.Hard;

import java.util.Arrays;

// 2251. Number of Flowers in Full Bloom
// https://leetcode.com/problems/number-of-flowers-in-full-bloom/
// Runtime 37 ms Beats 95%
// Memory 72.8 MB Beats 44.23%

public class NumOfFlowersInFullBloom_2251 {
    int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1, res = arr.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }

    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int[] start = new int[flowers.length];
        int[] end = new int[flowers.length];
        int i = 0;
        for (int[] arr : flowers) {
            start[i] = arr[0];
            end[i++] = arr[1];
        }
        Arrays.sort(start);
        Arrays.sort(end);

        int n = people.length;
        int[] ans = new int[n];
        for (i = 0; i < n; i++) {
            // x - min day when flower started blooming for people[i] + 1
            int x = binarySearch(start, people[i] + 1);
            // y - min day when flower still bloomed for people[i]
            int y = binarySearch(end, people[i]);
            ans[i] = x - y;
        }
        return ans;
    }
}