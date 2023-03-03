package Strings.Medium;

// 28. Find the Index of the First Occurrence in a String
// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
// Runtime 0 ms Beats 100%
// Memory 40.6 MB Beats 37.26%

public class FindTheIndexOfTheFirstOccurrenceInAString_28 {
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}