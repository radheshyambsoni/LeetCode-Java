package Arrays.Medium;

import java.util.HashMap;
import java.util.HashSet;

// 1817. Finding the Users Active Minutes
// https://leetcode.com/problems/finding-the-users-active-minutes/
// Runtime 16 ms Beats 91.61%
// Memory 55.88 MB Beats 46.13%
// Nov 25, 2023

public class FindingTheUsersActiveMinutes_1817 {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for (int[] log : logs) {
            if (map.containsKey(log[0])) {
                map.get(log[0]).add(log[1]);
            } else {
                HashSet<Integer> set = new HashSet<>();
                set.add(log[1]);
                map.put(log[0], set);
            }
        }

        int[] ans = new int[k];
        for (HashSet<Integer> set : map.values()) {
            ans[set.size() - 1]++;
        }

        return ans;
    }
}