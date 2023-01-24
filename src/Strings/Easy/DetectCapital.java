package Strings.Easy;

// https://leetcode.com/problems/detect-capital/
// Runtime 1 ms Beats 100%
// Memory 40.8 MB Beats 82.57%
// January 02, 2023 - Daily Challenge

public class DetectCapital{
    public boolean detectCapitalUse(String word) {
        if(word.length()==1){
            return true;
        }
        int caps=0;
        for(char c:word.toCharArray()){
            if(c<='Z'){
                caps++;
            }
        }

        return (caps==1 && word.charAt(0)<='Z') || caps==word.length() || caps==0;
    }
}