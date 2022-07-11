package Strings;

import java.util.Arrays;

// 1832. Check if the Sentence Is Pangram
// https://leetcode.com/problems/check-if-the-sentence-is-pangram/
// Related Topics - Hash Table, Strings

public class IsPangram {
    public boolean checkIfPangram(String sentence) {
        boolean check[]=new boolean[26];
        Arrays.fill(check, false);
        for(int i=0;i<sentence.length();i++){
            check[sentence.charAt(i)-97]=true;
        }
        
        for(int i=0,j=13;i<13;i++){
            if(!(check[i] && check[j++])){
                return false;
            }
        }
        
        return true;
    }
}
