package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 56. Merge Intervals
// https://leetcode.com/problems/merge-intervals/
// Runtime 8 ms Beats 96.51%
// Memory 45.1 MB Beats 98.13%
// Aug 09, 2023

public class MergeIntervals_56 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 1)
            return intervals;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> ans = new ArrayList<>();
        int[] last = null;
        for (int i = 0; i < intervals.length; i++) {
            if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < intervals[i][0]) {
                last = intervals[i];
                ans.add(last);
            } else {
                last[1] = Math.max(last[1], intervals[i][1]);
            }
        }

        int[][] ret = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            ret[i] = ans.get(i);
        }
        return ret;
    }
}