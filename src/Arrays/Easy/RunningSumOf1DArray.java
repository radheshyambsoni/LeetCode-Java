package Arrays.Easy;

// 1480. Running Sum of 1d Array
// https://leetcode.com/problems/running-sum-of-1d-array/
// Related Topics - Array, Prefix Sum

public class RunningSumOf1DArray {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
    }
}