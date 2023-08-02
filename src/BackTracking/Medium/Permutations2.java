package BackTracking.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 47. Permutations II
// https://leetcode.com/problems/permutations-ii/
// Runtime 8 ms Beats 36.86%
// Memory 45.1 MB Beats 6.17%

public class Permutations2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        addPermutations(nums, 0, new ArrayList<>(), ans);
        return new ArrayList<>(ans);
    }

    void addPermutations(int[] nums, int idx, List<Integer> l, Set<List<Integer>> ans) {
        if (idx == nums.length) {
            ans.add(new ArrayList<>(l));
            return;
        }
        for (int i = idx; i < nums.length; i++) {
            if (i != idx && nums[idx] == nums[i])
                continue;
            swap(nums, idx, i);
            l.add(nums[idx]);
            addPermutations(nums, idx + 1, l, ans);
            l.remove(l.size() - 1);
            swap(nums, idx, i);
        }
    }

    void swap(int[] nums, int i, int j) {
        if (i == j)
            return;
        nums[i] ^= nums[j];
        nums[j] ^= nums[i];
        nums[i] ^= nums[j];
    }
}