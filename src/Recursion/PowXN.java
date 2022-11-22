package Recursion;

// https://leetcode.com/problems/powx-n/
// Runtime 1 ms Beats 87.9%
// Memory 43.6 MB Beats 20.53%

public class PowXN {
    public double myPow(double x, int n) {
        if(x==0){return 0;}
        if(n==0){return 1;}        
        return helper(x,n);
    }
    private double helper(double x, int n) {
        if(n==1){
            return x;
        }
        if(n==-1){
            return 1/x;
        }
        double temp=helper(x,n/2);
        if(n%2==0){            
            return temp*temp;
        }
        if(n>0){
            return temp*temp*x;
        }
        return temp*temp*(1/x);
    }
}