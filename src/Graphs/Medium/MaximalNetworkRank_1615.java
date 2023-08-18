package Graphs.Medium;

// 1615. Maximal Network Rank
// https://leetcode.com/problems/maximal-network-rank/
// Runtime 4 ms Beats 88.27%
// Memory 44.7 MB Beats 11.56%
// Aug 18, 2023

public class MaximalNetworkRank_1615 {
    public int maximalNetworkRank(int n, int[][] roads) {
        boolean[][] adjMat = new boolean[n][n];
        int[] count = new int[n];
        for (int[] arr : roads) {
            adjMat[arr[0]][arr[1]] = true;
            adjMat[arr[1]][arr[0]] = true;
            count[arr[0]]++;
            count[arr[1]]++;
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            int cnt1 = count[i];
            for (int j = i + 1; j < n; j++) {
                int cnt2 = count[j];
                max = Math.max(max, (cnt1 + cnt2 - (adjMat[i][j] ? 1 : 0)));
            }
        }

        return max;
    }
}