package BackTracking.Medium;

import java.util.ArrayList;
import java.util.List;

// 22. Generate Parentheses
// https://leetcode.com/problems/generate-parentheses/
// Runtime 0 ms Beats 100%
// Memory 42 MB Beats 99.16%
// May 23, 2023

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