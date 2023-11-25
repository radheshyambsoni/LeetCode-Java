package Arrays.Medium;

// 2442. Count Number of Distinct Integers After Reverse Operations
// https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations/
// Runtime 13 ms Beats 99.73%
// Memory 55.64 MB Beats 97.99%
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
        boolean[] set = new boolean[(int) 1e6 + 1];
        int cnt = 0;
        for (int num : nums) {
            if (!set[num]) {
                set[num] = true;
                cnt++;
            }

            int rev = reverse(num);
            if (!set[rev]) {
                set[rev] = true;
                cnt++;
            }
        }

        return cnt;
    }
}