package Strings.Easy;

// https://leetcode.com/problems/is-subsequence/ - Easy
// Runtime 0 ms Beats 100%
// Memory 40.4 MB Beats 74.91%
// December 30, 2022

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()){
            return false;
        }
        char[] S=s.toCharArray();        
        char[] T=t.toCharArray();

        int i=0,j=0,m=S.length,n=T.length;
        while(i<m && j<n){
            if(S[i]==T[j]){
                i++;
            }
            j++;
        }
        return i==m;
    }
}