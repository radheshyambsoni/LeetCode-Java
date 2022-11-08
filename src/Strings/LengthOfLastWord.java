package Strings;

// 58. Length of Last Word - Easy
// https://leetcode.com/problems/length-of-last-word/

// Given a string s consisting of words and spaces, return the length of the last word in the string.

// A word is a maximal substring consisting of non-space characters only.
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        int lastLength=0;
        while(i>=0 && s.charAt(i)==' '){i--;}
        lastLength++;
        while(i>=0 && s.charAt(i)!=' '){i--;lastLength++;}
        
        return lastLength-1;
    }
}
