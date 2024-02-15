package Arrays.Medium;

import java.util.Arrays;

// 2971. Find Polygon With the Largest Perimeter
// https://leetcode.com/problems/find-polygon-with-the-largest-perimeter/
// Runtime 29 ms Beats 69.56%
// Memory 56.33 MB Beats 63.32%
// Feb 15, 2024

public class FindPolygonWithTheLargestPerimeter_2971 {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }

        for (int i = nums.length - 1; i > 1; i--) {
            sum -= nums[i];
            if (sum > nums[i]) {
                return sum + nums[i];
            }
        }

        return -1;
    }
}