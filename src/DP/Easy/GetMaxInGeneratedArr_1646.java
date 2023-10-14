package DP.Easy;

// 1646. Get Maximum in Generated Array
// https://leetcode.com/problems/get-maximum-in-generated-array/
// Runtime 0 ms Beats 100%
// Memory 38.9 MB Beats 86.73%
// February 11, 2023

public class GetMaxInGeneratedArr_1646 {
    public int getMaximumGenerated(int n) {
        if(n==0 || n==1){
            return n;
        }
        int[] dp=new int[n+1];
        dp[0]=1;dp[1]=1;
        int max=1;
        for(int i=2;i<=n;i++){
            if(i%2==0){
                dp[i]=dp[i/2];
            }else{
                dp[i]=dp[i/2]+dp[i/2+1];
            }
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}