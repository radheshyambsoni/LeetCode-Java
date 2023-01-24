package Strings.Easy;

// https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
// Runtime 1 ms Beats 88.71%
// Memory 42.8 MB Beats 27.37%

public class NumOfSubstr {
    public static int numOfStrings(String[] patterns,String word){
        int count=0;
        for(String i:patterns){
            if(i.length()<=word.length() && word.contains(i)){
                count++;
            }
        }
        return count;
    }
}
