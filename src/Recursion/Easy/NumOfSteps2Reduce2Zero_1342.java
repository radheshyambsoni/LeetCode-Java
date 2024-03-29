package Recursion.Easy;

// 1342. Number of Steps to Reduce a Number to Zero
// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

public class NumOfSteps2Reduce2Zero_1342 {
    // Runtime 1 ms Beats 80.86%
    // Memory 41.1 MB Beats 31.30%
    public int helper(int n, int count) {
        if (n == 0) {
            return count;
        }
        if (n % 2 == 0) {
            return helper(n / 2, count + 1);
        }
        return helper(n - 1, count + 1);
    }

    public int numberOfSteps(int num) {
        return helper(num, 0);
    }

    // Runtime 1 ms Beats 80.86%
    // Memory 41.1 MB Beats 31.30%
    // public int numberOfSteps(int num) {
    // int count=0;
    // while(num!=0){
    // if(num%2==0){
    // num/=2;
    // }else{
    // --num;
    // }
    // ++count;
    // }
    // return count;
    // }
}