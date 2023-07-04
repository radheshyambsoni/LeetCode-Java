package DP.Medium;

// 494. Target Sum
// https://leetcode.com/problems/target-sum/
// Runtime 4 ms Beats 94.16%
// Memory 43.2 MB Beats 38.84%
// Jul 04, 2023

public class TargetSum_494 {
    int f(int[] arr,int diff){
        int totSum=0;
        for(int i:arr) totSum+=i;
		totSum-=diff;
        if(totSum<0 || totSum%2==1) return 0;
        totSum/=2;

        int[] prev = new int[totSum+1];
        if(arr[0]==0) prev[0]=2;
        else prev[0]=1; 

        if(arr[0]!=0 && arr[0]<=totSum) prev[arr[0]]=1;

        for(int i=1;i<arr.length;i++){
        	int[] curr = new int[totSum+1];
            for(int j=0;j<=totSum;j++){
                int nottake = prev[j];
                int take = 0;
                if(arr[i]<=j) take = prev[j-arr[i]];
                curr[j]= (nottake + take);
            }
			prev=curr;            
        }
		return prev[totSum];
    }
    public int findTargetSumWays(int[] nums, int target) {
        return f(nums,target);
    }
}