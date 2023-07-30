package Strings.Easy;

// 1961. Check If String Is a Prefix of Array
// https://leetcode.com/problems/check-if-string-is-a-prefix-of-array/
// Runtime 0 ms  Beats 100%
// Memory 41.3 MB Beats 85.71%
// Jul 30, 2023

public class CheckIfStrIsAPrefixOfArr_1961 {
    public boolean isPrefixString(String s, String[] words) {
        int pos = 0;
        for (int i = 0; i < words.length; i++) {
            int idx = s.indexOf(words[i], pos);
            if (idx == pos) {
                pos += words[i].length();
                if (pos == s.length())
                    return true;
            } else {
                return false;
            }
        }
        return false;
    }
}