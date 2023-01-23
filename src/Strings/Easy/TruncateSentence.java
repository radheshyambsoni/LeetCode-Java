package Strings.Easy;

// https://leetcode.com/problems/truncate-sentence/ - Easy
// Runtime 1 ms Beats 95.10%
// Memory 42.4 MB Beats 62.74%
// December 05, 2022

public class TruncateSentence {
    public static String truncateSentence(String s, int k) {
        char[] str=s.toCharArray();
        int i=0,l=str.length;
        while(k!=0 && i<l){
            if(str[i]==' ' || i==l-1){
                k--;
            }
            i++;
        }
        if(i==l){
            return s.substring(0,i);
        }
        return s.substring(0,i-1);
    }
}
