package Arrays.Medium;

// 1769. Minimum Number of Operations to Move All Balls to Each Box
// https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/description/
// Runtime 2 ms Beats 100.00%
// Memory 44.62 MB Beats 7.04%
// Dec 27, 2023

public class MinNumOfOpsToMoveAllBallsToEachBox_1769 {
    public int[] minOperations(String boxes) {
        char[] chrs = boxes.toCharArray();
        int n = chrs.length;
        int[] pre = new int[n];
        int[] suf = new int[n];
        int sum = chrs[0] - '0';
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] + sum;
            sum += chrs[i] - '0';
        }

        sum = chrs[n - 1] - '0';
        for (int i = n - 2; i >= 0; i--) {
            suf[i] = suf[i + 1] + sum;
            sum += chrs[i] - '0';
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = pre[i] + suf[i];
        }

        return ans;
    }
}