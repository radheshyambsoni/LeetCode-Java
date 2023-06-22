package BackTracking.Medium;

// 2044. Count Number of Maximum Bitwise-OR Subsets
// https://leetcode.com/problems/count-number-of-maximum-bitwise-or-subsets/
// Runtime 9 ms Beats 67.81%
// Memory 40.4 MB Beats 51.37%

public class CountNumOfMaBitwiseORSubsets_2044 {
    public int countMaxOrSubsets(int[] nums) {
        int maxOr=0;
        for(int num:nums) maxOr|=num;
        
        return helper(nums,maxOr,0,0);
    }

    int helper(int[] nums,int maxOr, int or,int idx){
        if(idx==nums.length){
            if(or==maxOr) return 1;
            return 0;
        }
        
        return helper(nums,maxOr, or|nums[idx],idx+1) + helper(nums,maxOr, or,idx+1);
    }
}