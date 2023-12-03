package Strings.Easy;

// 2185. Counting Words With a Given Prefix
// https://leetcode.com/problems/counting-words-with-a-given-prefix/
// Runtime 0 ms Beats 100.00%
// Memory 41.48 MB Beats 94.06%
// Dec 03, 2023

public class CountingWordsWithAGivenPrefix_2185 {
    public int prefixCount(String[] words, String pref) {
        int cnt = 0;
        for (String w : words) {
            if (w.indexOf(pref) == 0) {
                cnt++;
            }
        }

        return cnt;
    }
}