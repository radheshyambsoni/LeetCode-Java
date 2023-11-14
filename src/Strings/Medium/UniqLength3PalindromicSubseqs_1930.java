package Strings.Medium;

import java.util.Arrays;
import java.util.HashSet;

// 1930. Unique Length-3 Palindromic Subsequences
// https://leetcode.com/problems/unique-length-3-palindromic-subsequences/
// Runtime 160 ms Beats 74.26%
// Memory 44.35 MB Beats 53.19%
// Nov 14, 2023

public class UniqLength3PalindromicSubseqs_1930 {
    public int countPalindromicSubsequence(String s) {
        // pos[c][0] - Array containing the first index
        // in the string where the char is found
        // pos[c][1] - Array containing the last index
        // in the string where the char is found
        int[][] pos = new int[26][2];
        for (int[] arr : pos) {
            Arrays.fill(arr, -1);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (pos[c - 'a'][0] != -1) {
                pos[c - 'a'][1] = i;
            } else {
                pos[c - 'a'][0] = i;
                pos[c - 'a'][1] = i;
            }
        }

        int uniqCnt = 0;
        for (int i = 0; i < 26; i++) {
            if (pos[i][0] == -1) {
                continue;
            }

            HashSet<Character> uniqCharsBetween = new HashSet<>();
            for (int j = pos[i][0] + 1; j < pos[i][1]; j++) {
                uniqCharsBetween.add(s.charAt(j));
            }

            uniqCnt += uniqCharsBetween.size();
        }

        return uniqCnt;
    }
}