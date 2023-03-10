package Math.Easy;

// 1317. Convert Integer to the Sum of Two No-Zero Integers
// https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/description/
// Runtime 0 ms Beats 100%
// Memory 40.8 MB Beats 20.91%
// March 10, 2023

public class ConvertInt2SumOf2NoZeroInt_1317 {
    boolean isNoZero(int n){
        while(n>0){
            if(n%10==0) return false;
            n/=10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        int[] ans={1,n-1};
        while(ans[0]<ans[1]){
            if(isNoZero(ans[0]) && isNoZero(ans[1])) break;
            ++ans[0];--ans[1];
        }
        return ans;
    }
}