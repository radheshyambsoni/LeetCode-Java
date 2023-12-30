package Strings.Medium;

// 1897. Redistribute Characters to Make All Strings Equal
// https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/
// Runtime 3 ms Beats 58.49% 
// Memory 44.21 MB Beats 6.04%
// Dec 30, 2023

public class RedistributeCharsToMakeAllStringsEqual_1897 {
    public boolean makeEqual(String[] words) {
        int[] freq = new int[26];
        for (String w : words) {
            for (char c : w.toCharArray()) {
                freq[c - 'a']++;
            }
        }

        int n = words.length;
        for (int f : freq) {
            if (f % n != 0) {
                return false;
            }
        }

        return true;
    }
}