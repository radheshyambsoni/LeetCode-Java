package Graphs.Medium;

// 547. Number of Provinces
// https://leetcode.com/problems/number-of-provinces/
// Runtime 1 ms Beats 96.16%
// Memory 46.7 MB Beats 8.28%
// Sep 08, 2023

public class NumberOfProvinces_547 {
    void dfs(boolean[] visited, int city, int[][] conn) {
        if (!visited[city]) {
            visited[city] = true;
            for (int i = 0; i < conn.length; i++) {
                if (i != city && conn[city][i] == 1)
                    dfs(visited, i, conn);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(visited, i, isConnected);
                cnt++;
            }
        }

        return cnt;
    }
}