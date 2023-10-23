package Math.Easy;

// 342. Power of Four
// https://leetcode.com/problems/power-of-four/
// Runtime 1 ms Beats 76.31%
// Memory 38.9 MB Beats 99.48%
// Oct 23, 2023

public class PowerOfFour_342 {
    public boolean isPowerOfFour(int n) {
        if (n <= 0)
            return false;
        if (n == 1) {
            return true;
        }

        while (n > 1) {
            if (n % 4 != 0)
                return false;
            n /= 4;
        }

        return true;
    }
}