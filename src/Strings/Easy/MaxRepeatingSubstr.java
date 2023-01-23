package Strings.Easy;

// https://leetcode.com/problems/maximum-repeating-substring/ - Easy
// Runtime 1 ms Beats 98.12%
// Memory 42.5 MB Beats 23.9%

public class MaxRepeatingSubstr {
    public static int maxRepeating(String sequence, String word) {
        StringBuilder temp=new StringBuilder(word);
        while(sequence.contains(temp)){
            temp.append(word);
        }
        return (temp.length()-word.length())/word.length();
    }
}