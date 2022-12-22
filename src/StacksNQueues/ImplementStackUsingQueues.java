package StacksNQueues;
import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/implement-stack-using-queues/ - Easy
// Runtime 0 ms Beats 100%
// Memory 39.7 MB Beats 99.30%
// December 22, 2022

class MyStack {

    public MyStack() {
        
    }
    private Queue<Integer> q=new LinkedList<>();

    public void push(int x) {
        q.add(x);
        for(int i=0;i<q.size()-1;i++){
            q.add(q.poll());
        }
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.size()==0;
    }
}