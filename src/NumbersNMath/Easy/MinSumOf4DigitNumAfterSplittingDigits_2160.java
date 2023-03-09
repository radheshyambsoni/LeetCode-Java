package NumbersNMath.Easy;

import java.util.Arrays;

// 2160. Minimum Sum of Four Digit Number After Splitting Digits
// https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/
// Runtime 0 ms Beats 100%
// Memory 39.6 MB Beats 27.27%
// Feb 09, 2023

public class MinSumOf4DigitNumAfterSplittingDigits_2160 {
    public int minimumSum(int num) {
        char[] digits=Integer.toString(num).toCharArray();
        Arrays.sort(digits);
        return (digits[0]+digits[1]-2*'0')*10+(digits[2]+digits[3]-2*'0');
    }
}