package Strings.Easy;

// 2255. Count Prefixes of a Given String
// https://leetcode.com/problems/count-prefixes-of-a-given-string/
// Runtime 1 ms Beats 44.44%
// Memory 43.2 MB Beats 82.60%
// Oct 22, 2023

public class CountPrefixesOfAGivenString_2255 {
    public int countPrefixes(String[] words, String s) {
        int cnt = 0;
        for (String w : words) {
            if (s.indexOf(w) == 0)
                cnt++;
        }

        return cnt;
    }
}