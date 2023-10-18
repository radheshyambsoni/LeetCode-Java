package Strings.Medium;

// 949. Largest Time for Given Digits
// https://leetcode.com/problems/largest-time-for-given-digits/
// Runtime 11 ms Beats 46.25%
// Memory 41.1 MB Beats 53.50%
// Oct 18, 2023

public class LargestTimeForGivenDigits_949 {
    boolean isValidHr(int h) {
        return h >= 0 && h < 24;
    }

    boolean isValidMin(int m) {
        return m >= 0 && m < 60;
    }

    int[] f(int[] arr, boolean[] v, int idx, int h, int m, int[] ans) {
        if (idx == 4) {
            if (ans[0] < h) {
                ans[0] = h;
                ans[1] = m;
            } else if (ans[0] == h) {
                if (ans[1] < m) {
                    ans[1] = m;
                }
            }

            return ans;
        }

        for (int i = 0; i < 4; i++) {
            if (idx > 1) {
                if (!v[i]) {
                    int temp = m * 10 + arr[i];
                    if (!isValidMin(temp))
                        continue;
                    v[i] = true;
                    f(arr, v, idx + 1, h, temp, ans);
                    v[i] = false;
                }
            } else {
                if (!v[i]) {
                    int temp = h * 10 + arr[i];
                    if (!isValidHr(temp))
                        continue;
                    v[i] = true;
                    f(arr, v, idx + 1, temp, m, ans);
                    v[i] = false;
                }
            }
        }

        return ans;
    }

    public String largestTimeFromDigits(int[] arr) {
        int[] ans = f(arr, new boolean[4], 0, 0, 0, new int[] { -1, -1 });

        if (ans[0] == -1 || ans[1] == -1)
            return "";

        return ((ans[0] < 10 ? "0" : "") + ans[0] + ":" + (ans[1] < 10 ? "0" : "") + ans[1]);
    }
}