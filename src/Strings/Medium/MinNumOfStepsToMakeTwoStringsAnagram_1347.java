package Strings.Medium;

// 1347. Minimum Number of Steps to Make Two Strings Anagram
// https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/
// Runtime 9 ms Beats 63.21%
// Memory 45.30 MB Beats 24.18%
// Jan 13, 2024

public class MinNumOfStepsToMakeTwoStringsAnagram_1347 {
    public int minSteps(String s, String t) {
        int[] f1 = new int[26];
        int[] f2 = new int[26];
        for (int i = 0; i < s.length(); i++) {
            f1[s.charAt(i) - 'a']++;
            f2[t.charAt(i) - 'a']++;
        }

        int ans = 0;
        for (int i = 0; i < 26; i++) {
            if (f2[i] > f1[i]) {
                ans += f2[i] - f1[i];
            }
        }

        return ans;
    }
}