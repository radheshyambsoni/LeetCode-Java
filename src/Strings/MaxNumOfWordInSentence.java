package Strings;

public class MaxNumOfWordInSentence {
    
}
class Solution {
    public int mostWordsFound(String[] sentences) {
        // Runtime 3 ms Beats 97.48%
        // Memory 41.9 MB Beats 89.30%
        int max=0;
        for(String s:sentences){
            String[] temp=s.split(" ");
            max=Math.max(max, temp.length);
        }
        return max;
    }
    public static void main(String[] args) {
        
    }
}