package Strings.Medium;

import java.util.ArrayList;
import java.util.List;

// 916. Word Subsets
// https://leetcode.com/problems/word-subsets/
// Runtime 14 ms Beats 54.42%
// Memory 53.2 MB Beats 43.36%
// Sep 08, 2023

public class WordSubsets_916 {
    int[] counter(String w) {
        int[] cnt = new int[26];
        for (char c : w.toCharArray())
            cnt[c - 'a']++;

        return cnt;
    }

    public List<String> wordSubsets(String[] w1, String[] w2) {
        int[] cnt = new int[26], temp;

        for (String w : w2) {
            temp = counter(w);
            for (int i = 0; i < 26; i++)
                cnt[i] = Math.max(cnt[i], temp[i]);
        }

        List<String> ans = new ArrayList<>();
        for (String w : w1) {
            temp = counter(w);
            int i = 0;
            for (; i < 26; i++) {
                if (temp[i] < cnt[i])
                    break;
            }

            if (i == 26)
                ans.add(w);
        }

        return ans;
    }
}