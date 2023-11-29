package Graphs.Medium;

import java.util.ArrayList;
import java.util.List;

// 1557. Minimum Number of Vertices to Reach All Nodes
// https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/
// Runtime 8 ms Beats 96.88%
// Memory 80.54 MB Beats 52.81%
// Nov 29, 2023

public class MinOfVerticesToReachAllNodes_1557 {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        boolean[] incoming = new boolean[n];
        for (List<Integer> e : edges) {
            incoming[e.get(1)] = true;
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!incoming[i]) {
                ans.add(i);
            }
        }

        return ans;
    }
}