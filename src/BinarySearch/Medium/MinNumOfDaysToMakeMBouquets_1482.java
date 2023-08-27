package BinarySearch.Medium;

// 1482. Minimum Number of Days to Make m Bouquets
// https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/
// Runtime 17 ms Beats 81.66%
// Memory 57.1 MB Beats 40.23%
// Aug 27, 2023

public class MinNumOfDaysToMakeMBouquets_1482 {
    boolean isPossible(int[] arr, int day, int m, int k) {
        int cnt = 0, numOfB = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day)
                cnt++;
            else {
                numOfB += cnt / k;
                cnt = 0;
            }
        }
        numOfB += cnt / k;
        return numOfB >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if ((1l * m * k) > bloomDay.length)
            return -1;

        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < bloomDay.length; i++) {
            mini = Math.min(mini, bloomDay[i]);
            maxi = Math.max(maxi, bloomDay[i]);
        }

        int low = mini, high = maxi;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(bloomDay, mid, m, k))
                high = mid - 1;
            else
                low = mid + 1;
        }

        return low;
    }
}