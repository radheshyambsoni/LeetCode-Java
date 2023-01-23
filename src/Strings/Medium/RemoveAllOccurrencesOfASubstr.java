package Strings.Medium;

// https://leetcode.com/problems/remove-all-occurrences-of-a-substring/ - Medium
// Runtime 1 ms Beats 100%
// Memory 40.4 MB Beats 98.77%
// January 15, 2023

public class RemoveAllOccurrencesOfASubstr{
    public String removeOccurrences(String s, String part) {
        StringBuilder sb=new StringBuilder(s);
        int n=part.length();
        while(sb.indexOf(part)!=-1){
            int idx=sb.indexOf(part);
            sb.delete(idx,idx+n);
        }
        return sb.toString();
    }
}