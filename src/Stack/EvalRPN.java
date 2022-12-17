package Stack;

import java.util.Stack;

// https://leetcode.com/problems/evaluate-reverse-polish-notation/ - Medium
// Runtime 6 ms Beats 89.26%
// Memory 42 MB Beats 91.46%
// December 17, 2022 - Daily LeetCode Challenge

public class EvalRPN{
    public int evalRPN(String[] tokens){
        Stack<Integer> s=new Stack<>();
        int val1,val2;
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                val1=s.pop();
                val2=s.pop();
                if(tokens[i].equals("+")){
                    val2+=val1;
                }else if(tokens[i].equals("-")){
                    val2-=val1;
                }else if(tokens[i].equals("*")){
                    val2*=val1;
                }else{
                    val2/=val1;
                }
                s.push(val2);
            }else{
                s.push(Integer.parseInt(tokens[i]));
            }
        }
        return s.pop();
    }
}