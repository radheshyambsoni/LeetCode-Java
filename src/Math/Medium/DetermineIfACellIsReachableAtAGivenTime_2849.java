package Math.Medium;

// 2849. Determine if a Cell Is Reachable at a Given Time
// https://leetcode.com/problems/determine-if-a-cell-is-reachable-at-a-given-time/
// Runtime 1 ms Beats 95.30%
// Memory 40.03 MB Beats 24.20%
// Nov 08, 2023

public class DetermineIfACellIsReachableAtAGivenTime_2849 {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int x = Math.abs(fx - sx);
        int y = Math.abs(fy - sy);

        if (x == y) {
            if (x == 0)
                return t != 1;
            return t >= x;
        }

        int min = Math.max(x, y);

        return t >= min;
    }
}