package BinarySearch.Medium;

// 1011. Capacity To Ship Packages Within D Days
// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
// Runtime 9 ms Beats 97.55%
// Memory 45 MB Beats 65.94%
// Aug 29, 2023

public class CapacityToShipPackagesWithinDDays_1011 {
    int cntDays(int[] wts, int cap) {
        int days = 0, curWt = 0;
        for (int wt : wts) {
            if (curWt + wt > cap) {
                days++;
                curWt = wt;
            } else {
                curWt += wt;
            }
        }
        if (curWt > 0 && curWt <= cap)
            return days + 1;

        return Integer.MAX_VALUE;
    }

    public int shipWithinDays(int[] weights, int days) {
        int totWt = 0, maxi = Integer.MIN_VALUE;
        for (int wt : weights) {
            maxi = Math.max(maxi, wt);
            totWt += wt;
        }

        if (days == 1)
            return totWt;
        if (days == totWt)
            return 1;

        int low = maxi, high = totWt;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (cntDays(weights, mid) <= days) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}