package Arrays.Medium;

// 2640. Find the Score of All Prefixes of an Array
// https://leetcode.com/problems/find-the-score-of-all-prefixes-of-an-array/
// Runtime 3 ms Beats 75.49%
// Memory 61.3 MB Beats 93.73%
// Jul 06, 2023

public class FindTheScoreOfAllPrefixesOfAnArr_2640 {
    public long[] findPrefixScore(int[] nums) {
        long[] ans=new long[nums.length];
        int max=nums[0];
        ans[0]=2*max;
        for(int i=1;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            ans[i]=ans[i-1]+nums[i]+max;
        }
        return ans;
    }
}