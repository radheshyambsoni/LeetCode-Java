package Math.Easy;

// 326. Power of Three
// https://leetcode.com/problems/power-of-three/
// Related Topics - Math, Recursion

public class PowerOfThree{
    public static boolean minimumTotal(int n) {
        double check=Math.log10(n)/Math.log10(3.0);
        return check==(int)check;
    }
}