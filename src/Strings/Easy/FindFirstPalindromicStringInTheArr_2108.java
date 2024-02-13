package Strings.Easy;

// 2108. Find First Palindromic String in the Array
// https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
// Runtime 1 ms Beats 100.00%
// Memory 44.78 MB Beats 76.00%
// Feb 13, 2024

public class FindFirstPalindromicStringInTheArr_2108 {
    boolean f(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public String firstPalindrome(String[] words) {
        for (String w : words) {
            if (f(w)) {
                return w;
            }
        }
        return "";
    }
}