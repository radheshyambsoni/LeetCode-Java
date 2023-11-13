package Strings.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 2785. Sort Vowels in a String
// https://leetcode.com/problems/sort-vowels-in-a-string/
// Runtime 42 ms Beats 75.00%
// Memory 45.27 MB Beats 66.71%
// Nov 13, 2023

public class SortVowelsInAString_2785 {
    boolean isVowel(char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o'
                || c == 'u';
    }

    public String sortVowels(String s) {
        char[] str = s.toCharArray();
        List<Character> l = new ArrayList<>();
        for (char c : str) {
            if (isVowel(c)) {
                l.add(c);
            }
        }

        Collections.sort(l);
        int j = 0;
        for (int i = 0; i < str.length; i++) {
            if (isVowel(str[i])) {
                str[i] = l.get(j++);
            }
        }

        return String.valueOf(str);
    }
}