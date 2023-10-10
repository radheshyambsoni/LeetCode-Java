package Arrays.Medium;

import java.util.Arrays;

// 1647. Minimum Deletions to Make Character Frequencies Unique
// https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique/
// Runtime 7 ms Beats 96.93%
// Memory 44.4 MB Beats 65.12%
// Oct 10, 2023

public class MinDel2MakeCharFreqsUnique_1647 {
    public int minDeletions(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray())
            freq[c - 'a']++;

        Arrays.sort(freq);

        int del = 0;
        for (int i = 24; i >= 0; i--) {
            if (freq[i] == 0)
                break;

            if (freq[i] >= freq[i + 1]) {
                int prev = freq[i];
                freq[i] = Math.max(0, freq[i + 1] - 1);
                del += prev - freq[i];
            }
        }

        return del;
    }
}