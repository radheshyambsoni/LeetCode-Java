package Strings;

// https://leetcode.com/problems/merge-strings-alternately/ - Easy
// Runtime 0 ms Beats 100%
// Memory 40.4 MB Beats 94.49%

public class MergeStringsAltern {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0;
        StringBuilder ans=new StringBuilder();
        while(i<word1.length() && j<word2.length()){
            ans.append(word1.charAt(i++));
            ans.append(word2.charAt(j++));
        }
        if(i<word1.length()){
            ans.append(word1.substring(i));
        }else{
            ans.append(word2.substring(j));
        }
        return ans.toString();
    }
}