package DP.Medium;

// 45. Jump Game II
// https://leetcode.com/problems/jump-game-ii/
// Runtime 1 ms Beats 99.54%
// Memory 42.9 MB Beats 31.26%
// February 12, 2023

public class JumpGame2 {
    public int jump(int[] nums) {
        int end=0,farthest=0;
        int jump=0;

        for(int i=0;i<nums.length-1;i++){
            farthest=Math.max(farthest,i+nums[i]);
            if(i==end){
                jump++;
                end=farthest;
            }
        }
        return jump;
    }
}