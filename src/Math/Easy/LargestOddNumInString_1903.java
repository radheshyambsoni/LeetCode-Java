package Math.Easy;

// 1903. Largest Odd Number in String
// https://leetcode.com/problems/largest-odd-number-in-string/
// Runtime 1 ms Beats 100.00%
// Memory 44.12 MB Beats 89.82%
// Dec 07, 2023

public class LargestOddNumInString_1903 {
    public String largestOddNumber(String num) {
        int i = num.length();
        String ans = "";
        while (i > 0) {
            int digit = num.charAt(i - 1) - '0';
            if (digit % 2 == 1) {
                ans = num.substring(0, i);
                break;
            }
            i--;
        }

        return ans;
    }
}