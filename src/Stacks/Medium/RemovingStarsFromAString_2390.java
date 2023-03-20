package Stacks.Medium;

import java.util.Stack;

// 2390. Removing Stars From a String
// https://leetcode.com/problems/removing-stars-from-a-string/
// Runtime 180 ms Beats 65.78%
// Memory 43.6 MB Beats 74%
// Mar 20, 2023

public class RemovingStarsFromAString_2390 {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='*'){
                if(!st.isEmpty()) st.pop();
            }else{
                st.push(c);
            }
        }
        StringBuilder ans=new StringBuilder();
        for(char c:st) ans.append(c);
        return ans.toString();
    }
}