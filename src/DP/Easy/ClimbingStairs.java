package DP.Easy;

// 70. Climbing Stairs
// https://leetcode.com/problems/climbing-stairs/
// Runtime 0 ms Beats 100%
// Memory 38.7 MB Beats 96.65%
// December 12, 2022 - Daily Challenge

public class ClimbingStairs{
    public int climbStairs(int n) {
        if(n==1){return 1;}
        if(n==2){return 2;}
        
        int n1=1,n2=2,ans=0;
        for(int i=3;i<=n;i++){
            ans=n1+n2;
            n1=n2;
            n2=ans;
        }
        
        return ans;
    }
}