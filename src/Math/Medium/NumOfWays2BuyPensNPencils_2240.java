package Math.Medium;

// 2240. Number of Ways to Buy Pens and Pencils
// https://leetcode.com/problems/number-of-ways-to-buy-pens-and-pencils/
// Runtime 11ms Beats 82.01%
// Memory 38.80MB Beats 92.47%
// Oct 27, 2023

public class NumOfWays2BuyPensNPencils_2240 {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        int pens = total / cost1;

        long ans = 0;
        for (int i = 0; i <= pens; i++) {
            ans += (total - i * cost1) / cost2 + 1;
        }

        return ans;
    }
}