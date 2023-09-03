package BitManipulation.Easy;

// 338. Counting Bits
// https://leetcode.com/problems/counting-bits/
// Runtime 0 ms Beats 100%
// Memory 38.9 MB Beats 94.44%
// Sep 01, 2023

public class CountingBits_338 {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        ans[0] = 0;
        for (int i = 1; i <= n; i++) {
            int temp = i, cnt = 0;
            while (temp > 0) {
                temp &= temp - 1;
                cnt++;
            }
            ans[i] = cnt;
        }
        return ans;
    }
}