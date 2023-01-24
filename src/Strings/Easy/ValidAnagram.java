package Strings.Easy;

// https://leetcode.com/problems/valid-anagram/
// Runtime 1 ms Beats 100%
// Memory 42.6 MB Beats 83.3%
// December 29, 2022

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        for(char c:t.toCharArray()){
            freq[c-'a']--;
        }
        for(int i:freq){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}