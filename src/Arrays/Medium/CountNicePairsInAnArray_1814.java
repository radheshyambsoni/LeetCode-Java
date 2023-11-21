package Arrays.Medium;

import java.util.HashMap;

// 1814. Count Nice Pairs in an Array
// https://leetcode.com/problems/count-nice-pairs-in-an-array/
// Runtime 30 ms Beats 91.25%
// Memory 54.22 MB Beats 80.47%
// Nov 21, 2023

public class CountNicePairsInAnArray_1814 {
    int rev(int n) {
        int num = 0;
        while (n > 0) {
            num = num * 10 + n % 10;
            n /= 10;
        }

        return num;
    }

    public int countNicePairs(int[] nums) {
        int MOD = (int) 1e9 + 7;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            nums[i] -= rev(nums[i]);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        long cnt = 0;
        for (int v : map.values()) {
            cnt = (cnt + ((long) v * (v - 1)) / 2) % MOD;
        }
        return (int) (cnt);
    }
}