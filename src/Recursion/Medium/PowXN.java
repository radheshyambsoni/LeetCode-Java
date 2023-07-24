package Recursion.Medium;

// 50. Pow(x, n)
// https://leetcode.com/problems/powx-n/
// Runtime 0 ms Beats 100%
// Memory 43.2 MB Beats 5.76%

public class PowXN {
    public double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 1 / helper(x, n * -1);
        }

        return helper(x, n);
    }

    private double helper(double x, int n) {
        if (n == 0)
            return 1;
        double temp = helper(x, n / 2);
        if (n % 2 == 0) {
            return temp * temp;
        }
        return temp * temp * x;
    }
}