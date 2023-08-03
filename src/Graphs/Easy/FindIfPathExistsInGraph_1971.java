package Graphs.Easy;

import java.util.ArrayList;
import java.util.List;

// 1971. Find if Path Exists in Graph
// https://leetcode.com/problems/find-if-path-exists-in-graph/
// Runtime 115 ms Beats 66.32%
// Memory 133.6 MB Beats 69.26%
// Aug 03, 2023

public class FindIfPathExistsInGraph_1971 {
    boolean dfs(List<List<Integer>> adjLs, boolean[] visited, int node, int dest) {
        if (node == dest)
            return true;
        visited[node] = true;
        for (int i : adjLs.get(node)) {
            if (!visited[i]) {
                if (dfs(adjLs, visited, i, dest))
                    return true;
            }
        }
        return false;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adjLs = new ArrayList<>(n);
        for (int i = 0; i < n; i++)
            adjLs.add(new ArrayList<>());

        for (int[] e : edges) {
            adjLs.get(e[0]).add(e[1]);
            adjLs.get(e[1]).add(e[0]);
        }

        return dfs(adjLs, new boolean[n], source, destination);
    }
}