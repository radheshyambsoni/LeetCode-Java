package Strings.Easy;

// https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/
// Runtime 1 ms Beats 97.46%
// Memory 40.6 MB Beats 81.41%
// January 23, 2023

public class CheckIfNumHasEqualDigitCountNDigitVal {
    public boolean digitCount(String num) {
        char[] n=num.toCharArray();
        int[] freq=new int[10];
        for(char c:n){
            freq[c-'0']++;
        }        
        for(int i=0;i<n.length;i++){            
            if(freq[i]!=(n[i]-'0')){
                return false;
            }
        }
        return true;
    }
}