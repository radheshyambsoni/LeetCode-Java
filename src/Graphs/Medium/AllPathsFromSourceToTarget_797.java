package Graphs.Medium;

import java.util.ArrayList;
import java.util.List;

// 797. All Paths From Source to Target
// https://leetcode.com/problems/all-paths-from-source-to-target/
// Runtime 1 ms Beats 99.90%
// Memory 45.00 MB Beats 91.97%
// Nov 29, 2023

public class AllPathsFromSourceToTarget_797 {
    void f(List<List<Integer>> ans, List<Integer> l, int curr, int[][] g) {
        if (curr == g.length - 1) {
            l.add(curr);
            ans.add(new ArrayList<>(l));
            l.remove(l.size() - 1);
            return;
        }

        l.add(curr);
        for (int v : g[curr]) {
            f(ans, l, v, g);
        }
        l.remove(l.size() - 1);
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        f(ans, new ArrayList<>(), 0, graph);
        return ans;
    }
}