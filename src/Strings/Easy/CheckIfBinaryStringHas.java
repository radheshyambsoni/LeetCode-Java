package Strings.Easy;

// https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/ - Easy

public class CheckIfBinaryStringHas{
    public boolean checkOnesSegment(String s) {
        // Logic - s should not have contain "01"
        // In other words, continuous 1's and/or continuous 0's only once
        // Runtime 1 ms Beats 85.42%
        // Memory 42.2 MB Beats 40.10%
        int i=0;
        while(i<s.length() && s.charAt(i)=='1'){i++;}
        while(i<s.length() && s.charAt(i)=='0'){i++;}
        return i==s.length();

        // Runtime 1 ms Beats 85.42% 
        // Memory 42.3 MB Beats 31.60%
        // return !s.contains("01");
    }
}