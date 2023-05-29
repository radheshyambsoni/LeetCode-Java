package Arrays.Easy;

// 1827. Minimum Operations to Make the Array Increasing
// https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/
// Runtime 2 ms Beats 94.53%
// Memory 44.5 MB Beats 6.17%
// May 29, 2023

public class MinOps2MakeTheArrIncreasing_1827 {
    public int minOperations(int[] nums) {
        if(nums.length==1) return 0;

        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                count+=nums[i-1]+1-nums[i];
                nums[i]=nums[i-1]+1;
            }
        }
        return count;
    }
}