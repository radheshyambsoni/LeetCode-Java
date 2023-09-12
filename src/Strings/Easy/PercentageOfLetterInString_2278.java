package Strings.Easy;

// 2278. Percentage of Letter in String
// https://leetcode.com/problems/percentage-of-letter-in-string/
// Runtime 0 ms Beats 100%
// Memory 40.6 MB Beats 19.96%
// Sep 12, 2023

public class PercentageOfLetterInString_2278 {
    public int percentageLetter(String s, char letter) {
        int cnt = 0;
        for (char c : s.toCharArray()) {
            if (c == letter)
                cnt++;
        }

        return (cnt * 100) / s.length();
    }
}