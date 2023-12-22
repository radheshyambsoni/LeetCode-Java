package Strings.Easy;

// 1422. Maximum Score After Splitting a String
// https://leetcode.com/problems/maximum-score-after-splitting-a-string/
// Runtime 1 ms Beats 97.78%
// Memory 41.52 MB Beats 32.89%
// Dec 22, 2023

public class MaxScoreAfterSplittingAString_1422 {
    public int maxScore(String s) {
        int n = s.length();
        int[] preSum = new int[n];
        preSum[0] = s.charAt(0) == '1' ? 1 : 0;
        for (int i = 1; i < n; i++) {
            preSum[i] = preSum[i - 1] + (s.charAt(i) == '1' ? 1 : 0);
        }

        int max = 0, total = preSum[n - 1];
        for (int i = 1; i < n; i++) {
            int zerosOnLeft = i - preSum[i - 1];
            int onesOnRight = total - preSum[i - 1];
            max = Math.max(max, zerosOnLeft + onesOnRight);
        }

        return max;
    }
}