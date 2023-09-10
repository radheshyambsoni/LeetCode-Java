package Strings.Easy;

// import java.util.HashSet;
// import java.util.Set;

// 1790. Check if One String Swap Can Make Strings Equal
// https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/
// Runtime 0 ms Beats 100%
// Memory 40.6 MB Beats 63.88%
// Sep 10, 2023

public class CheckIf1StrSwapCanMakeStrsEqual_1790 {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2))
            return true;

        // if s1 != s2
        // only two indices should differ from with each other
        // such that s1[i1] = s2[i2] and s1[i2] = s2[i1]
        // then only string swap is psbl
        int idx1 = -1, idx2 = -1;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (idx1 == -1) { // if found diff chars for the 1st time
                    idx1 = i;
                } else if (idx2 == -1) { // if found diff chars for the 2nd time
                    idx2 = i;
                } else
                    return false; // if found diff chars for 3rd time
            }
        }

        return idx1 != -1 && idx2 != -1 && s1.charAt(idx1) == s2.charAt(idx2) && s1.charAt(idx2) == s2.charAt(idx1);
    }
}

// // Runtime 1 ms Beats 58.27%
// // Memory 40.2 MB Beats 93.9%
// // Sep 10, 2023

// public class CheckIf1StrSwapCanMakeStrsEqual_1790 {
// public boolean areAlmostEqual(String s1, String s2) {
// if (s1.equals(s2))
// return true;

// int cnt = 0;
// Set<Character> set1 = new HashSet<>();
// Set<Character> set2 = new HashSet<>();
// for (int i = 0; i < s1.length(); i++) {
// char c1 = s1.charAt(i), c2 = s2.charAt(i);
// if (c1 != c2) {
// cnt++;
// set1.add(c1);
// set2.add(c2);
// }
// if (cnt > 2) {
// return false;
// }
// }

// return cnt == 2 && set1.equals(set2);
// }
// }