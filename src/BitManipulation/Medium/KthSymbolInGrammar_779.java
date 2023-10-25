package BitManipulation.Medium;

// 779. K-th Symbol in Grammar
// https://leetcode.com/problems/k-th-symbol-in-grammar/
// Runtime 0 ms Beats 100.00%
// Memory 39.04 MB Beats 56.73%
// Oct 25, 2023

public class KthSymbolInGrammar_779 {
    // Observation - the first half of value is the complement of the other
    // 0110 => 01 | 10
    // The length of the nth row is double the length of the (n-1)th row.
    // If k is in the 1st half of the nth row, the symbol at position k in the nth
    // row is the same as the symbol at position k in the (n-1)th row.
    // If k is in the second half of the nth row, the symbol at position k in the
    // nth row is the opposite of the symbol at position (k - length of (n-1)th row)
    // in the (n-1)th row.
    public int kthGrammar(int n, int k) {
        if (n == 1)
            return 0;

        int halfLength = 1 << (n - 2);
        if (k <= halfLength)
            return kthGrammar(n - 1, k);
        return 1 - kthGrammar(n - 1, k - halfLength);
    }
}