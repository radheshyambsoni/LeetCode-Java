package Strings.Easy;

// 1160. Find Words That Can Be Formed by Characters
// https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
// Runtime 5 ms Beats 95.43%
// Memory 44.20 MB Beats 42.47%
// Dec 02, 2023

public class FindWordsThatCanBeFormedByChars_1160 {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[26];
        for (char c : chars.toCharArray()) {
            freq[c - 'a']++;
        }

        int lSum = 0;
        for (String w : words) {
            int[] temp = new int[26];
            for (char c : w.toCharArray()) {
                temp[c - 'a']++;
            }

            boolean check = true;
            for (int i = 0; i < 26; i++) {
                if (temp[i] > freq[i]) {
                    check = false;
                    break;
                }
            }
            if (check) {
                lSum += w.length();
            }
        }

        return lSum;
    }
}