package Strings.Easy;

// 459. Repeated Substring Pattern
// https://leetcode.com/problems/repeated-substring-pattern/
// Runtime 5 ms Beats 98.81%
// Memory 43.9 MB Beats 83.73%
// Aug 21, 2023

public class RepeatedSubstringPattern_459 {
    int helper(String substr, String s, int len, int n) {
        int check = 0;
        for (int j = len; j <= n - len; j += len) {
            check = 1;
            if (!s.substring(j, j + len).equals(substr)) {
                return -1;
            }
        }
        return check;
    }

    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i != 0)
                continue;
            int len = n / i;
            String substr = s.substring(0, len);
            if (helper(substr, s, len, n) == 1)
                return true;
        }

        if (helper(s.substring(0, 1), s, 1, n) == 1)
            return true;

        return false;
    }
}