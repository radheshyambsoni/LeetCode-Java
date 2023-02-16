package Stacks.Medium;

// 1381. Design a Stack With Increment Operation
// https://leetcode.com/problems/design-a-stack-with-increment-operation/
// Runtime 5 ms Beats 77.4%
// Memory 42.9 MB Beats 81.53%
// February 16, 2023

class CustomStack {
    int[] s;
    int maxSize,size;
    public CustomStack(int maxSize) {
        this.maxSize=maxSize;
        this.size=0;
        s=new int[maxSize];
    }
    
    public void push(int x) {
        if(size>=maxSize){
            return;
        }
        s[size++]=x;
    }
    
    public int pop() {
        if(s.length==0){
            return -1;
        }
        return s[--size];
    }
    
    public void increment(int k, int val) {
        for(int i=0;i<Math.min(k,s.length);i++){
            s[i]+=val;
        }
    }
}
