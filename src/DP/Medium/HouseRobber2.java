package DP.Medium;

// 213. House Robber II
// https://leetcode.com/problems/house-robber-ii
// Runtime 0 ms Beats 100%
// Memory 39.6 MB Beats 74.95%
// February 08, 2023
// complete solution from recursion to memoization to tabulation to space optimization - https://github.com/radheshyambsoni/DSA_KK/blob/master/src/TUF/DP/DP06_HouseRobber.java

public class HouseRobber2 {
    int help(int[] arr){
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
    public int rob(int[] arr) {
        if(arr.length==1){return arr[0];}
        int n=arr.length;
        int[] temp1=new int[n-1];
        System.arraycopy(arr, 0, temp1, 0, n-1);
        int[] temp2=new int[n-1];
        System.arraycopy(arr, 1, temp2, 0, n-1);
        return Math.max(help(temp1),help(temp2));
    }
}