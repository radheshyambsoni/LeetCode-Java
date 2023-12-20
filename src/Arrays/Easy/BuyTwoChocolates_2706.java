package Arrays.Easy;

// 2706. Buy Two Chocolates
// https://leetcode.com/problems/buy-two-chocolates/
// Runtime 1 ms Beats 100.00%
// Memory 43.68 MB Beats 21.83%
// Dec 20, 2023

public class BuyTwoChocolates_2706 {
    public int buyChoco(int[] prices, int money) {
        int small = 101, secondSmall = 101;
        for (int p : prices) {
            if (small > p) {
                secondSmall = small;
                small = p;
            } else if (secondSmall > p) {
                secondSmall = p;
            }
        }

        return (small + secondSmall) <= money ? money - (small + secondSmall) : money;
    }
}