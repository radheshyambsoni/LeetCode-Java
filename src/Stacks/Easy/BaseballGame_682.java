package Stacks.Easy;

import java.util.Stack;

// 682. Baseball Game
// https://leetcode.com/problems/baseball-game/
// Runtime 3 ms Beats 85.21%
// Memory 40.7 MB Beats 64.42%
// Jul 16, 2023

public class BaseballGame_682 {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String op: operations){
            if(op.equals("+")){
                int prev1=st.pop();
                int prev2=st.pop();
                st.push(prev2);
                st.push(prev1);
                st.push(prev1+prev2);
            }else if(op.equals("C")){
                st.pop();
            }else if(op.equals("D")){
                st.push(2*st.peek());
            }else{
                st.push(Integer.parseInt(op));
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}