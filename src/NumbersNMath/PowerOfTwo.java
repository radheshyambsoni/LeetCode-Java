package NumbersNMath;

// 231. Power of Two - Easy
// https://leetcode.com/problems/power-of-two/
// Related Topics - Math, Bit Manipulation, Recursion
// Runtime: 1 ms, faster than 100.00% of Java online submissions for Power of Two.
// Memory Usage: 39.8 MB, less than 87.28% of Java online submissions for Power of Two.

public class PowerOfTwo{
    public static boolean minimumTotal(int n) {
        if(n<=0){
            return false;
        }
        double check=Math.log10(n)/Math.log10(2);
        return check-(int)check==0;
    }
}