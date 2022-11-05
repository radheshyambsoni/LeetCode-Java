package Strings;

// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/ - Easy
// Runtime 0 ms Beats 100%
// Memory 40.4 MB Beats 85.53%

public class CheckIf2StringArraysAreEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1=new StringBuilder();
        for(String i:word1){
            s1.append(i);
        }
        StringBuilder s2=new StringBuilder();
        for(String i:word2){
            s2.append(i);
        }

        return s1.toString().equals(s2.toString());
    }
}