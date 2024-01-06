package Stacks.Medium;

// 1249. Minimum Remove to Make Valid Parentheses
// https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
// Runtime 10 ms Beats 93.78%
// Memory 45.50 MB Beats 16.91%
// Jan 06, 2024

public class MinRemoveToMakeValidParentheses_1249 {
    public String minRemoveToMakeValid(String s) {
        int open = 0, close = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
            } else if (c == ')') {
                if (close < open) {
                    close++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        open = Math.min(open, close);
        close = open;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (open > 0) {
                    open--;
                    sb.append(c);
                }
            } else if (c == ')') {
                if (close > 0 && close > open) {
                    close--;
                    sb.append(c);
                }
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}