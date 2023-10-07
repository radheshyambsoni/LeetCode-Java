package Strings.Medium;

// 2486. Append Characters to String to Make Subsequence
// https://leetcode.com/problems/append-characters-to-string-to-make-subsequence/
// Runtime 5 ms Beats 78.64%
// Memory 44.4 MB Beats 23.3%
// Oct 07, 2023

public class AppendCharacters2String2MakeSubseq_2486 {
    public int appendCharacters(String s, String t) {
        int i = 0, j = 0;
        int m = s.length(), n = t.length();
        while (i < m && j < n) {
            if (s.charAt(i) == t.charAt(j))
                j++;

            i++;
        }

        return n - j;
    }
}