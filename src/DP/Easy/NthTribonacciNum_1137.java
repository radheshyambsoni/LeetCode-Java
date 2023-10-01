package DP.Easy;

// 1137. N-th Tribonacci Number
// https://leetcode.com/problems/n-th-tribonacci-number/
// Runtime 0 ms Beats 100%
// Memory 38.7 MB Beats 95.83%
// January 30, 2023 - Daily Challenge

public class NthTribonacciNum_1137 {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int t0 = 0, t1 = 1, t2 = 1, tn = -1;
        for (int i = 3; i <= n; i++) {
            tn = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = tn;
        }
        return t2;
    }
}