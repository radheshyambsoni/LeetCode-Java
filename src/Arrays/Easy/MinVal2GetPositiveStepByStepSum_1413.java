package Arrays.Easy;

// 1413. Minimum Value to Get Positive Step by Step Sum
// https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/
// Runtime 0 ms Beats 100%
// Memory 40 MB Beats 45.5%
// Mar 16, 2023

public class MinVal2GetPositiveStepByStepSum_1413 {    
    public int minStartValue(int[] nums) {
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
            min=Math.min(min,nums[i]);
        }
        if(min>0){
            return 1;
        }
        return Math.abs(min)+1;
    }
}