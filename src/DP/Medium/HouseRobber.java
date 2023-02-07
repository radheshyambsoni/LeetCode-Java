package DP.Medium;

// 198. House Robber
// https://leetcode.com/problems/house-robber/
// Runtime 0 ms Beats 100%
// Memory 39.9 MB Beats 42.30%
// February 07, 2023
// complete solution from recursion to memoization to tabulation to space optimization - https://github.com/radheshyambsoni/DSA_KK/blob/master/src/TUF/DP/DP05_MaxSumOfNonAdjEle.java

public class HouseRobber {
    public int rob(int[] arr) {
        int dp0=0,dp1=arr[0];
        for(int i=1;i<arr.length;i++){
            int pick=arr[i];
            if(i>1){
                pick+=dp0;
            }
            int notPick=0;
            if(i>0){
                notPick=dp1;
            }
            dp0=dp1;
            dp1=Math.max(pick,notPick);
        }
        return dp1;
    }
}