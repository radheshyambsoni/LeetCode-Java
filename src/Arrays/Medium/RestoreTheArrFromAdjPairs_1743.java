package Arrays.Medium;

import java.util.HashMap;
import java.util.HashSet;

// 1743. Restore the Array From Adjacent Pairs
// https://leetcode.com/problems/restore-the-array-from-adjacent-pairs/
// Runtime 105 ms Beats 68.03%
// Memory 105.72 MB Beats 35.66%
// Nov 10, 2023

public class RestoreTheArrFromAdjPairs_1743 {
    public int[] restoreArray(int[][] adjacentPairs) {
        int n = adjacentPairs.length + 1, max = (int) 1e9;

        if (n == 1)
            return adjacentPairs[0];

        HashMap<Integer, int[]> map = new HashMap<>();
        for (int[] arr : adjacentPairs) {
            if (map.containsKey(arr[0])) {
                map.get(arr[0])[1] = arr[1];
            } else {
                map.put(arr[0], new int[] { arr[1], max });
            }

            if (map.containsKey(arr[1])) {
                map.get(arr[1])[1] = arr[0];
            } else {
                map.put(arr[1], new int[] { arr[0], max });
            }
        }

        HashSet<Integer> set = new HashSet<>();
        int start = max;
        for (int num : map.keySet()) {
            if (map.get(num)[1] == max) {
                if (start == max) {
                    start = num;
                    break;
                }
            }
        }

        int[] ans = new int[n];
        ans[0] = start;
        set.add(start);

        dfs(map, set, start, 1, ans);

        return ans;
    }

    void dfs(HashMap<Integer, int[]> map, HashSet<Integer> set, int curr, int idx, int[] ans) {
        if (idx >= ans.length)
            return;

        int[] temp = map.get(curr);

        if (!set.contains(temp[0])) {
            set.add(temp[0]);
            ans[idx] = temp[0];
            dfs(map, set, temp[0], idx + 1, ans);
        } else if (temp[1] != (int) 1e9 && !set.contains(temp[1])) {
            set.add(temp[1]);
            ans[idx] = temp[1];
            dfs(map, set, temp[1], idx + 1, ans);
        }
    }
}