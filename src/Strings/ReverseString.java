package Strings;

// 344. Reverse String
// https://leetcode.com/problems/reverse-string/
// Runtime 1 ms Beats 99.94%
// Memory 49.4 MB Beats 86%

public class ReverseString{
    public void reverseString(char[] s) {        
        int i=0,j=s.length-1;
        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
}