package Arrays.Medium;

// 1685. Sum of Absolute Differences in a Sorted Array
// https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/
// Runtime 5 ms Beats 26.20%
// Memory 57.7 MB Beats 56.15%
// June 30, 2023

public class SumOfAbsDiffsInASortedArr_1685 {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        ans[0]=nums[0];
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1] +nums[i];
        }
        for(int i=0;i<n;i++){
            int left=i>0?ans[i-1]:0;
            int right=ans[n-1]-ans[i];
            nums[i]=Math.abs(left-(i+1)*nums[i])+right-(n-i)*nums[i];
        }
        return nums;
    }
}