package Math.Easy;

// 342. Power of Four
// https://leetcode.com/problems/power-of-four/
// Related Topics - Math, Bit Manipulation, Recursion

public class PowerOfFour{
    public static boolean minimumTotal(int n) {
        double check=Math.log10(n)/Math.log10(4.0);
        return check==(int)check;
    }
}