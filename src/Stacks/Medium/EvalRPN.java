package Stacks.Medium;

import java.util.Stack;

// https://leetcode.com/problems/evaluate-reverse-polish-notation/ - Medium
// Runtime 6 ms Beats 89.26%
// Memory 42 MB Beats 91.46%
// December 17, 2022 - Daily LeetCode Challenge

public class EvalRPN{
    /* Basic idea behind the given function is as follows: 
     * As the given RPN means the expression is postfix expression.
     * In a postfix expression, an operator is written after its operands.
     * We will be traversing the array of strings and while we traverse we do the following:
        * Our idea is to push the integer form of the string to the stack until we find an opernad in the given array of string
        * When we find that the current string is an operator, we will do the following:
            * we will pop two element and store them in val1 and val2 respectively
            * and then perform the operation as: val2 op val1
            * and then we will push the resultant back to the stack
        
        * Following the above process we will reach to the end of the array and finally stack will be having the topmost and the only element as our answer
    */
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