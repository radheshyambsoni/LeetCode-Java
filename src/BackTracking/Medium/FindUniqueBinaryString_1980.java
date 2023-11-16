package BackTracking.Medium;

import java.util.HashSet;

// 1980. Find Unique Binary String
// https://leetcode.com/problems/find-unique-binary-string/
// Runtime 1 ms Beats 77.09%
// Memory 40.62 MB Beats 45.45%
// Nov 16, 2023

public class FindUniqueBinaryString_1980 {
    boolean f(char[] str, int idx, int n, HashSet<String> set) {
        if (idx == n) {
            String s = String.valueOf(str);
            if (!set.contains(s)) {
                return true;
            }

            return false;
        }

        str[idx] = '0';
        if (f(str, idx + 1, n, set))
            return true;
        str[idx] = '1';
        if (f(str, idx + 1, n, set)) {
            return true;
        }

        return false;
    }

    public String findDifferentBinaryString(String[] nums) {
        int n = nums[0].length();
        HashSet<String> set = new HashSet<>();
        for (String s : nums) {
            set.add(s);
        }

        char[] str = new char[n];
        f(str, 0, n, set);

        return String.valueOf(str);
    }
}