package Strings.Medium;

import java.util.Arrays;

// 1624. Largest Substring Between Two Equal Characters
// https://leetcode.com/problems/largest-substring-between-two-equal-characters/
// Runtime 1 ms Beats 86.22%
// Memory 41.43 MB Beats 11.53%
// Dec 31, 2023

public class LargestSubstringBetweenTwoEqualChars_1624 {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max = -1;
        int[] idxs = new int[26];
        Arrays.fill(idxs, -1);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (idxs[c - 'a'] != -1) {
                max = Math.max(max, i - idxs[c - 'a'] - 1);
            } else {
                idxs[c - 'a'] = i;
            }
        }

        return max;
    }
}