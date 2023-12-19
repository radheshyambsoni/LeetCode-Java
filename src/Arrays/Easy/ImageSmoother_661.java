package Arrays.Easy;

// 661. Image Smoother
// https://leetcode.com/problems/image-smoother/
// Runtime 4 ms Beats 93.84%
// Memory 44.75 MB Beats 33.89%
// Dec 19, 2023

public class ImageSmoother_661 {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length, n = img[0].length;
        int[][] ans = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int rowStart = Math.max(i - 1, 0), rowEnd = Math.min(i + 2, m), cnt = 0;
                int colStart = Math.max(j - 1, 0), colEnd = Math.min(j + 2, n), sum = 0;
                for (int r = rowStart; r < rowEnd; r++) {
                    for (int c = colStart; c < colEnd; c++) {
                        sum += img[r][c];
                        cnt++;
                    }
                }
                ans[i][j] = sum / cnt;
            }
        }

        return ans;
    }
}