package Strings.Medium;

import java.util.Arrays;

// 179. Largest Number
// https://leetcode.com/problems/largest-number/
// Runtime 6 ms Beats 55.6%
// Memory 42.7 MB Beats 94.46%
// Jul 18, 2023

public class LargestNumber_179 {
    public String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            strs[i] = "" + nums[i];
        Arrays.sort(strs, (a, b) -> (-(a + b).compareTo(b + a)));

        StringBuilder sb = new StringBuilder();
        for (String s : strs)
            sb.append(s);
        while (sb.charAt(0) == '0' && sb.length() > 1) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}