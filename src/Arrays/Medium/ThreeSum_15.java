package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Collections;
// import java.util.HashSet;
import java.util.List;
// import java.util.Set;

// 15. 3Sum
// https://leetcode.com/problems/3sum/
// Runtime 23 ms Beats 99.79%
// Memory 50.5 MB Beats 83.60%
// Aug 01, 2023

// Optimal solution
public class ThreeSum_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0)
                break;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1])
                        j++;
                    while (j < k && nums[k] == nums[k + 1])
                        k--;
                }
            }
        }

        return ans;
    }
}

// // Better than brute
// // Runtime 1050 ms Beats 6.49%
// // Memory 53 MB Beats 5.66%
// public class ThreeSum_15 {
// public List<List<Integer>> threeSum(int[] nums) {
// Set<List<Integer>> helper = new HashSet<>();
// for (int i = 0; i < nums.length - 2; i++) {
// Set<Integer> set = new HashSet<>();
// for (int j = i + 1; j < nums.length; j++) {
// int third = -(nums[i] + nums[j]);
// if (set.contains(third)) {
// List<Integer> temp = new ArrayList<>();
// temp.add(nums[i]);
// temp.add(nums[j]);
// temp.add(third);
// Collections.sort(temp);
// helper.add(temp);
// }
// set.add(nums[j]);
// }
// }

// return new ArrayList<>(helper);
// }
// }