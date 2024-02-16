package Arrays.Hard;

// 41. First Missing Positive
// https://leetcode.com/problems/first-missing-positive/
// Runtime 1 ms Beats 98.85%
// Memory 54.81 MB Beats 79.29%
// Feb 16, 2024

public class FirstMissingPositive_41 {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIdx = nums[i] - 1;
            if (nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[correctIdx]) {
                int temp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = temp;
            } else {
                i++;
            }
        }

        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }
}