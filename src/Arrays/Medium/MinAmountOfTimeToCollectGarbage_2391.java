package Arrays.Medium;

// 2391. Minimum Amount of Time to Collect Garbage
// https://leetcode.com/problems/minimum-amount-of-time-to-collect-garbage/
// Runtime 33 ms Beats 43.56%
// Memory 61.83 MB Beats 43.37%
// Nov 20, 2023

public class MinAmountOfTimeToCollectGarbage_2391 {
    public int garbageCollection(String[] garbage, int[] travel) {
        int n = garbage.length;
        for (int i = 1; i < n - 1; i++) {
            travel[i] += travel[i - 1];
        }

        int lastG = -1, lastM = -1, lastP = -1;
        int g = 0, m = 0, p = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < garbage[i].length(); j++) {
                if (garbage[i].charAt(j) == 'G') {
                    lastG = Math.max(lastG, i);
                    g++;
                } else if (garbage[i].charAt(j) == 'M') {
                    lastM = Math.max(lastM, i);
                    m++;
                } else {
                    lastP = Math.max(lastP, i);
                    p++;
                }
            }
        }

        int time = g + m + p;
        if (lastG > 0) {
            time += travel[lastG - 1];
        }
        if (lastM > 0) {
            time += travel[lastM - 1];
        }
        if (lastP > 0) {
            time += travel[lastP - 1];
        }

        return time;
    }
}