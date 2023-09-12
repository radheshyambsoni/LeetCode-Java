package BinarySearch.Medium;

import java.util.Arrays;

// 2187. Minimum Time to Complete Trips
// https://leetcode.com/problems/minimum-time-to-complete-trips/
// Runtime 88 ms Beats 54.82%
// Memory 56.1 MB Beats 57.89%
// Sep 12, 2023

public class MinTimeToCompleteTrips_2178 {
    // check if total trips completed at time t >= reqired
    boolean f(int[] time, long t, int totalTrips) {
        int totTrips = 0;
        for (int i = 0; i < time.length; i++) {
            if (totTrips >= totalTrips)
                break;
            totTrips += t / time[i];
        }

        return totTrips >= totalTrips;
    }

    public long minimumTime(int[] time, int totalTrips) {
        Arrays.sort(time);
        long low = time[0], high = time[0] * (long) totalTrips;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (f(time, mid, totalTrips)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}