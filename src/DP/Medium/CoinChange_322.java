package DP.Medium;

// 322. Coin Change
// https://leetcode.com/problems/coin-change/
// Runtime 20 ms Beats 57.3%
// Memory 43.8 MB Beats 28.43%
// Jul 04, 2023

public class CoinChange_322 {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];

        for(int amt=1;amt<=amount;amt++){
            if(amt%coins[0]==0) dp[amt]=amt/coins[0];
            else dp[amt]=(int)1e9;
        }

        for(int idx=1;idx<coins.length;idx++){
            int[] temp=new int[amount+1];
            for(int amt=0;amt<=amount;amt++){
                int notTake=dp[amt];
                int take=Integer.MAX_VALUE;
                if(coins[idx]<=amt){
                    take=1+temp[amt-coins[idx]];
                }
                temp[amt]=Math.min(take,notTake);
            }
            dp=temp;
        }
        return dp[amount]>=1e9?-1:dp[amount];
    }
}