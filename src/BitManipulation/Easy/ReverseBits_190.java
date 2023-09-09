package BitManipulation.Easy;

// 190. Reverse Bits
// https://leetcode.com/problems/reverse-bits/
// Runtime 1 ms Beats 53.1%
// Memory 40.5 MB Beats 83.24%
// Sep 09, 2023

public class ReverseBits_190 {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0, temp = n;
        for (int i = 0; i < 32; i++) {
            int bit = (temp >> i) & 1; // checking if the bit is set
            ans |= bit << (31 - i); // doing OR with (31 - i)th position
        }

        return ans;
    }
}