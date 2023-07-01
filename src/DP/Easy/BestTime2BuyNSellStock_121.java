package DP.Easy;

// 121. Best Time to Buy and Sell Stock
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Runtime 3 ms Beats 18.29%
// Memory 61.2 MB Beats 41.6%
// Jul 01, 2023

public class BestTime2BuyNSellStock_121 {
    public int maxProfit(int[] prices) {
        int profit=0, min=prices[0];
        for(int i=1;i<prices.length;i++){
            profit=Math.max(profit, prices[i]-min);
            min=Math.min(min,prices[i]);
        }
        return profit;
    }
}