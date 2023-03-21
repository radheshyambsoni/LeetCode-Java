package Arrays.Medium;

// 2348. Number of Zero-Filled Subarrays
// https://leetcode.com/problems/number-of-zero-filled-subarrays/
// Runtime 3 ms Beats 99.69%
// Memory 60.3 MB Beats 18.81%
// Mar 21, 2023 - Daily Challenge

public class NumOfZeroFilledSubarrs_2348 {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0;
        for(int i=0;i<nums.length;){
            int count=0;
            if(nums[i]==0){
                while(i<nums.length && nums[i++]==0){
                    ans+=++count;
                }
            }else{
                i++;
            }
        }
        return ans;
    }
}