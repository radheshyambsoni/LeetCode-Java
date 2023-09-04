package Arrays.Medium;

// 1861. Rotating the Box
// https://leetcode.com/problems/rotating-the-box/
// Runtime 8 ms Beats 69.74%
// Memory 69 MB Beats 47.86%
// Sep 04, 2023

public class RotatingTheBox_1861 {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length, n = box[0].length;
        for (int i = 0; i < m; i++) {
            int j = 0;
            while (j < n) {
                int k = j, cnt = 0;
                while (k < n && box[i][k] != '*') {
                    if (box[i][k++] == '#')
                        cnt++;
                }
                int end = k + 1;
                if (k != j)
                    k--;
                while (cnt > 0) {
                    box[i][k--] = '#';
                    cnt--;
                }
                while (k > j) {
                    box[i][k--] = '.';
                }
                if (k >= 0 && box[i][k] != '*')
                    box[i][k] = '.';

                j = end;
            }
        }

        char[][] ans = new char[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[j][m - i - 1] = box[i][j];
            }
        }
        return ans;
    }
}