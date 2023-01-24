package Stacks.Easy;

// https://leetcode.com/problems/valid-parentheses
// 20. Valid Parentheses
public class ValidParentheses{
    private char arr[];
    private int top;
    private int capacity;

    public void create(int size){
        arr=new char[size];
        capacity=size;
        top=-1;
    }

    public void push(char x){
        if(isFull()){
            System.out.println("Stack OverFlow");
            System.exit(1);
        }

        arr[++top]=x;
    }

    public char pop(){
        if(isEmpty()){
            System.out.println("STACK EMPTY");
            System.exit(1);
        }

        return arr[top--];
    }

    public int getSize(){return top+1;}

    public Boolean isEmpty(){return top==-1;}

    public Boolean isFull(){return top==capacity-1;}

    public void printStack(){
        for(int i=0; i <= top; i++){
            System.out.print(arr[i]+", ");
        }
    }

    
    public boolean isValid(String s){
        this.create(s.length());
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                this.push(s.charAt(i));
            }else if(s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}'){
                if(!this.isEmpty() && ((s.charAt(i)==')' && this.arr[top]=='(') || (s.charAt(i)==']' && this.arr[top]=='[') || (s.charAt(i)=='}' && this.arr[top]=='{'))){
                    this.pop();
                }else{
                    return false;
                }
            }
        }

        return isEmpty();
    }
    public static void main(String[] args) {
        String s="]";
        ValidParentheses t=new ValidParentheses();
        System.out.println(t.isValid(s));
    }
}