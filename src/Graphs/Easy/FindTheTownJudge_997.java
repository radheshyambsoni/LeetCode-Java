package Graphs.Easy;

// 997. Find the Town Judge
// https://leetcode.com/problems/find-the-town-judge/
// Runtime 2 ms Beats 99.61%
// Memory 48.65 MB Beats 79.69%
// Nov 28, 2023

public class FindTheTownJudge_997 {
    public int findJudge(int n, int[][] trust) {
        int[] isTrusted = new int[n + 1];
        int[] trusts = new int[n + 1];
        for (int[] arr : trust) {
            trusts[arr[0]]++;
            isTrusted[arr[1]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (isTrusted[i] == n - 1 && trusts[i] == 0) {
                return i;
            }
        }

        return -1;
    }
}