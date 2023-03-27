package Math.Medium;

// 172. Factorial Trailing Zeroes
// https://leetcode.com/problems/factorial-trailing-zeroes/
// Runtime 0 ms Beats 100%
// Memory 39.6 MB Beats 51.22%
// Mar 27, 2023

public class FactorialTrailingZeroes_172{
    public int trailingZeroes(int n) {
        int ans=0;
        while(n>0){
            n/=5;
            ans+=n;
        }
        return ans;
    }
}
