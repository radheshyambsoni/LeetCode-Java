package Strings.Medium;

// 8. String to Integer (atoi)
// https://leetcode.com/problems/string-to-integer-atoi/
// Runtime 1 ms Beats 100.00%
// Memory 40.91 MB Beats 91.38%
// Oct 03, 2023

public class StringToInteger_atoi_8 {
    public int myAtoi(String s) {
        boolean sign = true;
        int i = 0, n = s.length();

        if (n == 0)
            return 0;

        long ans = 0;
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        if (i < n && s.charAt(i) == '-') {
            sign = false;
            i++;
        } else if (i < n && s.charAt(i) == '+') {
            i++;
        }

        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            ans = ans * 10 + (s.charAt(i) - '0');
            if (ans > Integer.MAX_VALUE) {
                if (sign) {
                    ans = Integer.MAX_VALUE;
                } else {
                    ans = Integer.MIN_VALUE;
                }
                break;
            }
            if (ans < Integer.MIN_VALUE) {
                ans = Integer.MIN_VALUE;
                break;
            }
            i++;
        }

        int num = (int) ans * (sign ? 1 : -1);

        return num;
    }
}