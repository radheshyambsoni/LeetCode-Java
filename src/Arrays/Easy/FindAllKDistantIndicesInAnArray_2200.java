package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

// 2200. Find All K-Distant Indices in an Array
// https://leetcode.com/problems/find-all-k-distant-indices-in-an-array/
// Runtime 3 ms Beats 85.77%
// Memory 43.5 MB Beats 83.21%
// Sep 26, 2023

public class FindAllKDistantIndicesInAnArray_2200 {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ans = new ArrayList<>();

        int prev = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                ans.add(i);
                prev = i;
                continue;
            }

            if (prev != -1 && (i - prev) <= k) {
                ans.add(i);
                continue;
            }
            int end = Math.min(nums.length - 1, i + k);
            for (int j = i + 1; j <= end; j++) {
                if (nums[j] == key) {
                    ans.add(i);
                    break;
                }
            }
        }

        return ans;
    }
}