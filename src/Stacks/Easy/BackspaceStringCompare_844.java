package Stacks.Easy;

import java.util.Stack;

// 844. Backspace String Compare
// https://leetcode.com/problems/backspace-string-compare/
// Runtime 2 ms Beats 62%
// Memory 40.3 MB Beats 79.41%
// Oct 19, 2023

public class BackspaceStringCompare_844 {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (!st1.isEmpty())
                    st1.pop();
            } else
                st1.push(c);
        }
        for (char c : t.toCharArray()) {
            if (c == '#') {
                if (!st2.isEmpty())
                    st2.pop();
            } else
                st2.push(c);
        }
        while (!st1.isEmpty() && !st2.isEmpty())
            if (st1.pop() != st2.pop())
                return false;

        if (!st1.isEmpty() || !st2.isEmpty())
            return false;

        return true;
    }
}