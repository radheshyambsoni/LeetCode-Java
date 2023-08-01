package Arrays.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 15. 3Sum
// https://leetcode.com/problems/3sum/
// Runtime 1050 ms Beats 6.49%
// Memory 53 MB Beats 5.66%
// Aug 01, 2023

// Better than brute
public class ThreeSum_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> helper = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int third = -(nums[i] + nums[j]);
                if (set.contains(third)) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(third);
                    Collections.sort(temp);
                    helper.add(temp);
                }
                set.add(nums[j]);
            }
        }

        return new ArrayList<>(helper);
    }
}