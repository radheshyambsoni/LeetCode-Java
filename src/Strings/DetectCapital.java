package Strings;

// 520. Detect Capital - Easy
// https://leetcode.com/problems/detect-capital/
// Related Topics - String
// Runtime: 2 ms, faster than 68.13% of Java online submissions for Detect Capital.
// Memory Usage: 42 MB, less than 82.22% of Java online submissions for Detect Capital.

public class DetectCapital{
    public boolean detectCapitalUse(String word) {
        if(word.length()==1){return true;}
        if(word.charAt(0)>='A' && word.charAt(0)<='Z'){
            if(word.charAt(1)>='A' && word.charAt(1)<='Z'){
                for(int i=2;i<word.length();i++){
                    if(!(word.charAt(i)>='A' && word.charAt(i)<='Z')){
                        return false;
                    }
                }
            }else{
                for(int i=2;i<word.length();i++){
                    if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
                        return false;
                    }
                }
            }
        }else{
            for(int i=1;i<word.length();i++){
                if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
                    return false;
                }
            }
        }
        return true;
    }
}