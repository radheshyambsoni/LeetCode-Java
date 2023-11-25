package Arrays.Medium;

import java.util.HashSet;

// 2442. Count Number of Distinct Integers After Reverse Operations
// https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations/
// Runtime 55 ms Beats 70.59%
// Memory 65.98 MB Beats 25.53%
// Nov 25, 2023

public class CountNumOfDistinctIntegersAfterReverseOperations_2442 {
    int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        return rev;
    }

    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
            set.add(reverse(num));
        }

        return set.size();
    }
}