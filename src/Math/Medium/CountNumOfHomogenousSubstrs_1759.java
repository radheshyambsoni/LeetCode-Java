package Math.Medium;

// 1759. Count Number of Homogenous Substrings
// https://leetcode.com/problems/count-number-of-homogenous-substrings/
// Runtime 8 ms Beats 87.60%
// Memory 44.02 MB Beats 66.80%
// Nov 09, 2023

public class CountNumOfHomogenousSubstrs_1759 {
    public int countHomogenous(String s) {
        long cnt = 0, len = 1;
        char prev = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == prev) {
                len++;
            } else {
                cnt += (len * (len + 1)) / 2;
                prev = s.charAt(i);
                len = 1;
            }
        }

        cnt += (len * (len + 1)) / 2;

        return (int) (cnt % ((int) 1e9 + 7));
    }
}