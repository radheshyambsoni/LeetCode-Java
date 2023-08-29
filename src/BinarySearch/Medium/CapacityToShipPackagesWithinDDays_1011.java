package BinarySearch.Medium;

// 1011. Capacity To Ship Packages Within D Days
// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
// Runtime 9 ms Beats 97.55%
// Memory 44.9 MB Beats 77.93%
// Aug 29, 2023

public class CapacityToShipPackagesWithinDDays_1011 {
    int cntDays(int[] wts, int cap) {
        int days = 1, curWt = 0;
        for (int wt : wts) {
            if (curWt + wt > cap) {
                days++;
                curWt = wt;
            } else {
                curWt += wt;
            }
        }

        return days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int totWt = 0, maxi = -1;
        for (int wt : weights) {
            maxi = Math.max(maxi, wt);
            totWt += wt;
        }

        if (days == 1)
            return totWt;
        if (days == totWt)
            return 1;

        int low = maxi, high = totWt;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (cntDays(weights, mid) <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}