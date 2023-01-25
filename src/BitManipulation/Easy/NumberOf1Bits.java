package BitManipulation.Easy;

// catch is you need to treat n as unsigned
// and the operator needed to do so is ">>>"
// 191. Number of 1 Bits
// https://leetcode.com/problems/number-of-1-bits/
// Related Topics - Divide n Conquer, Bit Manipulation

public class NumberOf1Bits {
    public static int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            count+=n&1;
            n>>>=1;
        }
        return count;
    }
}