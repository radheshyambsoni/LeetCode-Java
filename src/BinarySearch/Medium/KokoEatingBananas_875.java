package BinarySearch.Medium;

// 875. Koko Eating Bananas
// https://leetcode.com/problems/koko-eating-bananas/
// Runtime 25 ms Beats 57.96%
// Memory 44.5 MB Beats 34.72%
// Aug 26, 2023

public class KokoEatingBananas_875 {
    int findMax(int[] piles) {
        int max = -1;
        for (int i = 0; i < piles.length; i++)
            max = Math.max(max, piles[i]);
        return max;
    }

    boolean totalHours(int[] piles, int hrly, int h) {
        int totalH = 0;
        for (int i = 0; i < piles.length; i++) {
            totalH += Math.ceil(piles[i] / (double) hrly);
        }
        return totalH <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = findMax(piles);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            boolean totalHrs = totalHours(piles, mid, h);
            if (totalHrs) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}