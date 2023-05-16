package DP.Hard;

import java.util.Arrays;

// 1289. Minimum Falling Path Sum II
// https://leetcode.com/problems/minimum-falling-path-sum-ii/
// Runtime 61 ms Beats 51.50%
// Memory 49.9 MB Beats 27.47%
// May 16, 2023

public class MinFallingPathSum2_1289 {
    public int minFallingPathSum(int[][] grid) {
        if(grid.length==1){
            int min=100;
            for(int i:grid[0]) min=Math.min(min,i);
            return min;
        }
        
        int[] dp=new int[grid.length];
        Arrays.fill(dp,(int)2e4);
        
        for(int col=0;col<grid.length;col++){
            int min=(int)2e4;
            for(int i=0;i<grid.length;i++){
                if(i!=col){
                    min=Math.min(min,grid[0][i]);
                }
            }
            dp[col]=min;
        }

        for(int row=1;row<grid.length;row++){
            int[] temp=new int[grid.length];
            for(int col=0;col<grid.length;col++){
                int min=(int)2e4;
                for(int i=0;i<grid.length;i++){
                    if(i!=col){
                        min=Math.min(min,grid[row][i]+dp[i]);
                    }
                }
                temp[col]=min;
            }
            dp=temp;
        }

        int min=(int)2e4;
        for(int col=0;col<grid.length;col++){            
            min=Math.min(min,dp[col]);
        }
        return min;
    }
}