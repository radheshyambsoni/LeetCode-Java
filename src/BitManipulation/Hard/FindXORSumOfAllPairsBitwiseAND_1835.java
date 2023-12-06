package BitManipulation.Hard;

// 1835. Find XOR Sum of All Pairs Bitwise AND
// https://leetcode.com/problems/find-xor-sum-of-all-pairs-bitwise-and/
// Runtime 1 ms Beats 100.00%
// Memory 56.64 MB Beats 30.00%
// Dec 06, 2023

public class FindXORSumOfAllPairsBitwiseAND_1835 {
    public int getXORSum(int[] arr1, int[] arr2) {
        int xor2 = arr2[0];
        for (int i = 1; i < arr2.length; i++) {
            xor2 ^= arr2[i];
        }

        int xor1 = arr1[0] & xor2;
        for (int i = 1; i < arr1.length; i++) {
            xor1 ^= arr1[i] & xor2;
        }

        return xor1;
    }
}