package Strings.Easy;

// 1662. Check If Two String Arrays are Equivalent
// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
// Runtime 0 ms Beats 100.00%
// Memory 41.30 MB Beats 7.59%
// Dec 01, 2023

public class CheckIf2StrArrAreEquivalent_1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        for (String i : word1) {
            s1.append(i);
        }
        StringBuilder s2 = new StringBuilder();
        for (String i : word2) {
            s2.append(i);
        }

        return s1.toString().equals(s2.toString());
    }
}