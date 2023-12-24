package Strings.Easy;

// 1758. Minimum Changes To Make Alternating Binary String
// https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/
// Runtime 2 ms Beats 98.03%
// Memory 42.69 MB Beats 5.57%
// Dec 24, 2023

public class MinChangesToMakeAlternatingBinaryString_1758 {
    public int minOperations(String s) {
        int way = 0;
        char curr = '0';
        for (char c : s.toCharArray()) {
            way = (curr != c) ? way + 1 : way;
            curr = curr == '1' ? '0' : '1';
        }

        return Math.min(way, s.length() - way);
    }
}