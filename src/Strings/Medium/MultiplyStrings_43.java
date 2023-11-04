package Strings.Medium;

// 43. Multiply Strings
// https://leetcode.com/problems/multiply-strings/
// Runtime 23 ms Beats 7.18%
// Memory 44.29 MB Beats 5.96%
// Nov 04, 2023

public class MultiplyStrings_43 {
    public String addStrings(String num1, String num2) {
        StringBuilder ans = new StringBuilder("");
        int i = num1.length() - 1, j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int x = i >= 0 ? num1.charAt(i--) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j--) - '0' : 0;
            int val = (x + y + carry) % 10;
            carry = (x + y + carry) / 10;
            ans.append(val);
        }
        if (carry != 0) {
            ans.append(carry);
        }
        return ans.reverse().toString();
    }
}