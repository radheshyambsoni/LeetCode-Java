package DP.Medium;

import java.util.List;

// 120. Triangle
// https://leetcode.com/problems/triangle/
// Runtime 2 ms Beats 87.28%
// Memory 41.4 MB Beats 99.43%
// February 14, 2023

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int[] dp=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=triangle.get(n-1).get(i);
        }
        for(int i=n-2;i>=0;i--){
            List<Integer> l=triangle.get(i);
            int[] cur=new int[n];
            for(int j=0;j<=i;j++){
                cur[j]=l.get(j)+Math.min(dp[j],dp[j+1]);
            }
            dp=cur;
        }
        return dp[0];
    }
}