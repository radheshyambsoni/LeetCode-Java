package NumbersNMath;

// 509. Fibonacci Number
// https://leetcode.com/problems/fibonacci-number/
// Related Topics - Math, DP, Recursion, Memorization

public class FibonacciNumber {
    public int fib(int n) {
        if(n==1 || n==0){
            return n;
        }
        int t1=0,t2=1;        
        int tn=0;
        for(int i=2;i<=n;i++){
            tn=t1+t2;
            t1=t2;
            t2=tn;
        }
        
        return tn;
    }
}