package Strings.Medium;

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static int strStr(String haystack, String needle) {
        if(needle.length()==0){return 0;}
        return haystack.indexOf(needle);
    }
    public static void main(String[] args) {
        String a="hello";
        String b="lo";
        System.out.println(strStr(a, b));
    }
}
