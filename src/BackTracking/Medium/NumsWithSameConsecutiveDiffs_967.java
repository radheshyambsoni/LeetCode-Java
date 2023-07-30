package BackTracking.Medium;

import java.util.ArrayList;

// 967. Numbers With Same Consecutive Differences
// https://leetcode.com/problems/numbers-with-same-consecutive-differences/
// Runtime 1 ms Beats 100%
// Memory 41 MB Beats 85.18%
// Jul 31, 2023

public class NumsWithSameConsecutiveDiffs_967 {
    public int[] numsSameConsecDiff(int n, int k) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            helper(n - 1, k, i, l);
        }
        int[] ans = new int[l.size()];
        for (int i = 0; i < l.size(); i++)
            ans[i] = l.get(i);
        return ans;
    }

    void helper(int n, int k, int num, ArrayList<Integer> l) {
        if (n == 0) {
            l.add(num);
            return;
        }

        int lastDigit = num % 10;

        int digit1 = lastDigit - k;
        if (digit1 >= 0)
            helper(n - 1, k, num * 10 + digit1, l);

        if (k == 0)
            return;
        int digit2 = lastDigit + k;
        if (digit2 < 10)
            helper(n - 1, k, num * 10 + digit2, l);
    }
}