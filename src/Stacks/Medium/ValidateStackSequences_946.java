package Stacks.Medium;

import java.util.Stack;

// 946. Validate Stack Sequences
// https://leetcode.com/problems/validate-stack-sequences/description/
// Runtime 3 ms Beats 86.33%
// Memory 42.7 MB Beats 13.67%
// Mar 26, 2023

public class ValidateStackSequences_946 {
    Stack<Integer> s=new Stack<>();
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i=0,j=0;
        while(i<pushed.length){
            if(pushed[i]==popped[j]){
                i++;j++;  
            }else if(!s.isEmpty() && s.peek()==popped[j]){
                s.pop();
                j++;
            }else{
                s.push(pushed[i]);
                i++;
            }
        }
        for(;j<popped.length;j++){
            int val=s.pop();
            if(val!=popped[j]) return false;
        }
        return true;
    }
}
