package BackTracking;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/generate-parentheses/ - Medium
// Runtime 1 ms Beats 97.95%
// Memory 43.6 MB Beats 54.82%
// December 01, 2022

public class GenerateParentheses {
    List<String> ans=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        char[] s=new char[2*n];
        generate(n, 0, 0, s);
        return ans;
    }
    public void generate(int n,int open,int close,char[] s){
        if(open==n && close==n){
            ans.add(String.valueOf(s));
            return;
        }
        if(open<n){
            s[open+close]='(';
            generate(n, open+1, close,s);
        }
        if(close<n && close<open){
            s[open+close]=')';
            generate(n, open, close+1,s);
        }
    }
}