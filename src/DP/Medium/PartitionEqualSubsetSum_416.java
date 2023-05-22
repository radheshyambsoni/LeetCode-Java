package DP.Medium;

// 416. Partition Equal Subset Sum
// https://leetcode.com/problems/partition-equal-subset-sum/description/
// Runtime 66 ms Beats 47.39%
// Memory 43.7 MB Beats 75.6%

public class PartitionEqualSubsetSum_416 {
    static boolean fSpaceOptim(int[] arr,int target){
        boolean[] dp=new boolean[target+1];
        dp[0]=true;
        if(arr[0]<=target) dp[arr[0]]=true;

        for(int idx=1;idx<arr.length;idx++){
            boolean[] temp=new boolean[target+1];
            temp[0]=true; // from base case condition
            for(int k=1;k<=target;k++){
                boolean notTake=dp[k];
                boolean take=false;
                if(arr[idx]<=k){
                    take=dp[k-arr[idx]];
                }
                temp[k] = (take || notTake);
            }
            dp=temp;
        }
        return dp[target];
    }
    public boolean canPartition(int[] nums) {
        int totalSum=0;
        for(int i:nums) totalSum+=i;
        if(totalSum%2!=0) return false;
        return fSpaceOptim(nums,totalSum/2);
    }
}