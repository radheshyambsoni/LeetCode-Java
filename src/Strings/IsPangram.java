package Strings;

// 1832. Check if the Sentence Is Pangram
// https://leetcode.com/problems/check-if-the-sentence-is-pangram/
// Related Topics - Hash Table, Strings

public class IsPangram {
    public boolean checkIfPangram(String sentence) {
        boolean check[]=new boolean[26];
        for(Character c:sentence.toCharArray()){
            check[c-97]=true;
        }
        
        for(boolean b:check){
            if(!b){return false;}
        }
        
        return true;
    }
}
