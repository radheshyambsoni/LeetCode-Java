package Recursion.Medium;

import java.util.ArrayList;
import java.util.List;

// 17. Letter Combinations of a Phone Number
// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
// Runtime 0 ms Beats 100%
// Memory 40.9 MB Beats 93.24%
// Aug 03, 2023

public class LetterCombinationsofAPhoneNum_17 {
    char[][] letters = {
            { 'a', 'b', 'c' },
            { 'd', 'e', 'f' },
            { 'g', 'h', 'i' },
            { 'j', 'k', 'l' },
            { 'm', 'n', 'o' },
            { 'p', 'q', 'r', 's' },
            { 't', 'u', 'v' },
            { 'w', 'x', 'y', 'z' }
    };

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0)
            return ans;
        helper(digits, ans, 0, new StringBuilder());
        return ans;
    }

    void helper(String digits, List<String> ans, int idx, StringBuilder sb) {
        if (idx == digits.length()) {
            ans.add(sb.toString());
            return;
        }

        int num = digits.charAt(idx) - '0' - 2;
        for (char c : letters[num]) {
            sb.append(c);
            helper(digits, ans, idx + 1, sb);
            sb.deleteCharAt(idx);
        }
    }
}