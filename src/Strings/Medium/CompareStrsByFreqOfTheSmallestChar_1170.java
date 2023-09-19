package Strings.Medium;

// 1170. Compare Strings by Frequency of the Smallest Character
// https://leetcode.com/problems/compare-strings-by-frequency-of-the-smallest-character/
// Runtime 12 ms Beats 54.31%
// Memory 43.4 MB Beats 95.43%
// Sep 19, 2023

public class CompareStrsByFreqOfTheSmallestChar_1170 {
    int f(String s) {
        int[] freq = new int[26];
        int min = 256;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
            min = Math.min(min, ch - 'a');
        }

        return freq[min];
    }

    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int n = words.length, q = queries.length;
        int[] freq = new int[n];
        int idx = 0;
        for (String s : words) {
            freq[idx++] = f(s);
        }

        int[] ans = new int[q];
        idx = 0;
        for (String qu : queries) {
            int temp = f(qu);
            int cnt = 0;
            for (int i : freq) {
                if (i > temp)
                    cnt++;
            }
            ans[idx++] = cnt;
        }

        return ans;
    }
}