package DP.Easy;

// 746. Min Cost Climbing Stairs
// https://leetcode.com/problems/min-cost-climbing-stairs/
// Runtime 0 ms Beats 100%
// Memory 41.8 MB Beats 86.82%
// February 10, 2023

public class MinCostClimbingStairs {
    // recursion
    int f(int idx,int[] cost){
        int prev=idx>0?f(idx-1,cost):0;
        int prev2=idx>1?f(idx-2,cost):0;
        if(idx==cost.length){return Math.min(prev,prev2);}
        return cost[idx]+Math.min(prev,prev2);
    }

    // memoization
    int f(int idx,int[] cost,int[] dp){
        if(idx<dp.length && dp[idx]!=-1){
            return dp[idx];
        }
        int prev=idx>0?f(idx-1,cost):0;
        int prev2=idx>1?f(idx-2,cost):0;
        if(idx==cost.length){
            return Math.min(prev,prev2);
        }
        return dp[idx]=cost[idx]+Math.min(prev,prev2);
    }

    public int minCostClimbingStairs(int[] cost) {
        // return f(cost.length,cost);

        // int[] dp=new int[cost.length];
        // Arrays.fill(dp,-1);
        // return f(cost.length,cost,dp);

        // tabulation
        // but with a catch
        // in recursion, we did not have a method to check if the value is calculated or not
        // i.e the condition in memoization if we eleminate the dp array from the scenario
        // but here we can use cost itself to store the values
        // so no more need of space optimization
        // In other words the tabulation would just use dp array to store values instead of cost and space optimization won't
        for(int i=0;i<cost.length;i++){
            cost[i]+=Math.min(i>0?cost[i-1]:0,i>1?cost[i-2]:0);
        }
        return Math.min(cost[cost.length-1],cost[cost.length-2]);
    }
}