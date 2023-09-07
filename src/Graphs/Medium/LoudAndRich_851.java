package Graphs.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 851. Loud and Rich
// https://leetcode.com/problems/loud-and-rich/
// Runtime 12 ms Beats 40.72%
// Memory 53.7 MB Beats 51.81%
// Sep 08, 2023

public class LoudAndRich_851 {
    void dfs(int curr, Map<Integer, List<Integer>> richer, int[] quiet, int[] ans) {
        if (ans[curr] != -1)
            return;

        ans[curr] = curr;
        for (int rich : richer.getOrDefault(curr, new ArrayList<>())) {
            dfs(rich, richer, quiet, ans);

            if (quiet[ans[rich]] < quiet[ans[curr]]) {
                ans[curr] = ans[rich];
            }
        }
    }

    public int[] loudAndRich(int[][] richer, int[] quiet) {
        int n = quiet.length;
        Map<Integer, List<Integer>> adjL = new HashMap<>();

        for (int[] arr : richer) {
            adjL.computeIfAbsent(arr[1], poor -> new ArrayList<>()).add(arr[0]);
        }

        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        for (int i = 0; i < n; i++) {
            if (ans[i] == -1) {
                dfs(i, adjL, quiet, ans);
            }
        }

        return ans;
    }
}