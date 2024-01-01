package Arrays.Easy;

import java.util.Arrays;

// 455. Assign Cookies
// https://leetcode.com/problems/assign-cookies/
// Runtime 8 ms Beats 98.82%
// Memory 45.52 MB Beats 6.13%
// Jan 01, 2024

public class AssignCookies_455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int cnt = 0;
        int i = g.length - 1, j = s.length - 1;

        while (i >= 0 & j >= 0) {
            if (s[j] >= g[i]) {
                cnt++;
                j--;
            }
            i--;
        }

        return cnt;
    }
}