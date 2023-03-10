package Math.Easy;

// 2119. A Number After a Double Reversal
// https://leetcode.com/problems/a-number-after-a-double-reversal/
// Runtime 0 ms Beats 100%
// Memory 39.5 MB Beats 20.28%

public class ANumAfterADoubleReversal_2119 {
    public boolean isSameAfterReversals(int num) {
        int rev=0,n=num;
        while(n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        int rev2=0;
        while(rev>0){
            rev2=rev2*10+rev%10;
            rev/=10;
        }
        return num==rev2;
    }
}
