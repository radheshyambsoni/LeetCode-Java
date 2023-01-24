package Strings.Easy;

import java.util.HashMap;

// https://leetcode.com/problems/word-pattern/
// Runtime 1 ms Beats 89.97%
// Memory 41.7 MB Beats 12.51%
// January 01, 2023 - Daily Challenge

public class WordPattern {
    public boolean wordPattern(String pattern, String s){
        String[] words=s.split(" ");
        if(words.length!=pattern.length()){
            return false;
        }

        HashMap<Character,String> map=new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String word=words[i];

            if(map.containsKey(c)){
                if(!map.get(c).equals(word)){
                    return false;
                }
            }else {
                if(map.containsValue(word)){
                    return false;
                }
                map.put(c, word);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(new WordPattern().wordPattern("abba", "dog dog dog dog"));
    }
}