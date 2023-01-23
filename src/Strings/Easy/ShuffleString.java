package Strings.Easy;

// // https://leetcode.com/problems/shuffle-string/ - Easy
// Runtime 2 ms Beats 77.30%
// Memory 45.1 MB Beats 32.75%

public class ShuffleString {
    public static String restoreString(String s, int[] indices) {
        char[] ans=new char[indices.length];
        int i=0;
        for(int j:indices){
            ans[j]=s.charAt(i++);
        }        
        return String.valueOf(ans);
    }
}