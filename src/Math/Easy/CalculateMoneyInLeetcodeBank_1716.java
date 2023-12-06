package Math.Easy;

// 1716. Calculate Money in Leetcode Bank
// https://leetcode.com/problems/calculate-money-in-leetcode-bank/
// Runtime 0 ms Beats 100.00%
// Memory 38.99 MB Beats 79.05%
// Dec 06, 2023

public class CalculateMoneyInLeetcodeBank_1716 {
    public int totalMoney(int n) {
        int weeks = n / 7;
        // using sum of AP
        int start = 1, sum = 0;
        for (int i = 0; i < weeks; i++, start++) {
            sum += 7 * (start + 3);
        }

        int rem = n % 7;
        sum += (rem * (2 * start + (rem - 1))) / 2;

        return sum;
    }
}