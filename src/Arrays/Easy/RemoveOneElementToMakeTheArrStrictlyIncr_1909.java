package Arrays.Easy;

// 1909. Remove One Element to Make the Array Strictly Increasing
// https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing/
// Runtime 0 ms Beats 100.00% 
// Memory 42.65 MB Beats 44.02%
// Feb 20, 2024

public class RemoveOneElementToMakeTheArrStrictlyIncr_1909 {
    public boolean canBeIncreasing(int[] nums) {
        int invalidCnt = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                invalidCnt++;
                if (i > 1 && nums[i] <= nums[i - 2]) {
                    nums[i] = nums[i - 1];
                }
            }
        }

        return invalidCnt <= 1;
    }
}