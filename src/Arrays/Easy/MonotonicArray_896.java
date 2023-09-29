package Arrays.Easy;

// 896. Monotonic Array
// https://leetcode.com/problems/monotonic-array/
// Runtime 1 ms Beats 99.82%
// Memory 55.8 MB Beats 40.74%
// Sep 29, 2023

public class MonotonicArray_896 {
    public boolean isMonotonic(int[] nums) {
        if (nums.length == 1)
            return true;

        int i = 0, n = nums.length;
        ;
        while (i < n - 1 && nums[i] == nums[i + 1]) {
            i++;
        }
        if (i == n - 1)
            return true;

        boolean flag = nums[i] < nums[i + 1];
        for (; i < n - 1; i++) {
            if ((flag && nums[i] > nums[i + 1]) || (!flag && nums[i] < nums[i + 1]))
                return false;
        }
        return true;
    }
}