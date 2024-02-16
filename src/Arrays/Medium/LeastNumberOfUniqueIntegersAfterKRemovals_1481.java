package Arrays.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

// 1481. Least Number of Unique Integers after K Removals
// https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/
// Runtime 43 ms Beats 83.79%
// Memory 63.33 MB Beats 21.66%
// Feb 16, 2024

public class LeastNumberOfUniqueIntegersAfterKRemovals_1481 {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> freq = new ArrayList<>(map.values());
        Collections.sort(freq);
        int uniq = freq.size();

        for (int f : freq) {
            if (f <= k) {
                k -= f;
                uniq--;
            } else {
                break;
            }
        }

        return uniq;
    }
}