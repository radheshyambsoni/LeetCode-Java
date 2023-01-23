package Strings.Easy;

// https://leetcode.com/problems/check-if-the-sentence-is-pangram/submissions/ - Easy
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Check if the Sentence Is Pangram.
// Memory Usage: 42.1 MB, less than 57.44% of Java online submissions for Check if the Sentence Is Pangram.

public class IsPangram {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }
        for(char i='a';i<='z';i++){
            if(sentence.indexOf(i)==-1){return false;}
        }
        return true;
    }
}
