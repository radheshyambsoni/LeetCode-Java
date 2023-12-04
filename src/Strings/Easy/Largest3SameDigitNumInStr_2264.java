package Strings.Easy;

// 2264. Largest 3-Same-Digit Number in String
// https://leetcode.com/problems/largest-3-same-digit-number-in-string/
// Runtime 1 ms Beats 91.57%
// Memory 40.40 MB Beats 97.49%
// Dec 04, 2023

public class Largest3SameDigitNumInStr_2264 {
    public String largestGoodInteger(String num) {
        char c = num.charAt(0);
        int max = -1, cnt = 1, n = c - '0';
        for (int i = 1; i < num.length(); i++) {
            if (num.charAt(i) == c) {
                cnt++;
            } else {
                cnt = 1;
                c = num.charAt(i);
                n = c - '0';
            }

            if (cnt == 3) {
                max = Math.max(max, n);
            }
        }

        if (max == -1) {
            return "";
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            ans.append(max);
        }

        return ans.toString();
    }
}