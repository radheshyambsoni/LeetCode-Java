package DP.Medium;

// 416. Partition Equal Subset Sum
// https://leetcode.com/problems/partition-equal-subset-sum/description/
// Runtime 46 ms Beats 70.20% 
// Memory 44 MB Beats 76.40%
// Jul 03, 2023

public class PartitionEqualSubsetSum_416 {
    public boolean canPartition(int[] nums) {
        int totSum=0;
        for(int i:nums) totSum+=i;
        if(totSum%2!=0) return false;
        totSum/=2;
        
        boolean[] dp=new boolean[totSum+1];
        dp[0]=true;
        if(nums[0]<=totSum) dp[nums[0]]=true;

        for(int idx=1;idx<nums.length;idx++){
            boolean[] temp=new boolean[totSum+1];
            temp[0]=true; // from base case condition
            for(int tar=1;tar<=totSum;tar++){
                boolean notTake=dp[tar];
                boolean take=false;
                if(nums[idx]<=tar){
                    take=dp[tar-nums[idx]];
                }
                temp[tar] = (take | notTake);
            }
            dp=temp;
        }
        return dp[totSum];
    }
}