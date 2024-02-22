package Strings.Medium;

// 443. String Compression
// https://leetcode.com/problems/string-compression/
// Runtime 1 ms Beats 99.42%
// Memory 43.87 MB Beats 67.27%
// Feb 22, 2024

public class StringCompression_443 {
    public int compress(char[] chars) {
        int idx = 0, j = 0;

        while (j < chars.length) {
            int i = j;
            while (j < chars.length && chars[i] == chars[j]) {
                j++;
            }
            chars[idx++] = chars[i];
            String cnt = String.valueOf(j - i);
            if (j - i != 1) {
                for (char c : cnt.toCharArray()) {
                    chars[idx++] = c;
                }
            }
        }

        return idx;
    }
}