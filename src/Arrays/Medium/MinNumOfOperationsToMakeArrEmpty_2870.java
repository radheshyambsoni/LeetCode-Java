package Arrays.Medium;

import java.util.HashMap;

// 2870. Minimum Number of Operations to Make Array Empty
// https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/
// Runtime 19 ms Beats 73.58%
// Memory 63.38 MB Beats 6.04%
// Jan 04, 2024

public class MinNumOfOperationsToMakeArrEmpty_2870 {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int cnt = 0;
        for (int f : map.values()) {
            if (f == 1) {
                return -1;
            } else {
                cnt += f / 3;
                if (f % 3 != 0) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}