package BitManipulation.Medium;

// 2433. Find The Original Array of Prefix Xor
// https://leetcode.com/problems/find-the-original-array-of-prefix-xor/
// Runtime 1 ms Beats 100.00%
// Memory 58.85 MB Beats 49.00%
// Oct 31, 2023

public class FindTheOriginalArrOfPrefixXor_2433 {
    public int[] findArray(int[] pref) {
        for (int i = pref.length - 1; i > 0; i--) {
            pref[i] ^= pref[i - 1];
        }
        return pref;
    }
}