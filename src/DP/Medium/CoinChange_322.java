package DP.Medium;

// 322. Coin Change
// https://leetcode.com/problems/coin-change/
// Runtime 426 ms Beats 5.11%
// Memory 44.1 MB Beats 15.72%
// Jul 04, 2023

public class CoinChange_322 {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];

        for(int amt=1;amt<=amount;amt++){
            if(amt%coins[0]==0) dp[amt]=amt/coins[0];
            else dp[amt]=-1;
        }

        for(int idx=1;idx<coins.length;idx++){
            int[] temp=new int[amount+1];
            for(int amt=0;amt<=amount;amt++){
                int quo=amt/coins[idx];
                int cnt=(int)1e9;
                for(int i=quo;i>=0;i--){
                    int prev=dp[amt-i*coins[idx]];
                    cnt=Math.min(cnt,i+(prev==-1?(int)1e9:prev));
                }
                temp[amt]=cnt!=(int)1e9?cnt:-1;
            }
            dp=temp;
        }
        return dp[amount];
    }
}