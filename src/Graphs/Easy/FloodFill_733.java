package Graphs.Easy;

// 733. Flood Fill
// https://leetcode.com/problems/flood-fill/
// Runtime 0 ms Beats 100%
// Memory 44.1 MB Beats 47.58%
// Sep 25, 2023

public class FloodFill_733 {
    void dfs(int[][] image, int r, int c, int clr, int initClr) {
        if (r < 0 || c < 0 || r >= image.length || c >= image[0].length)
            return;

        if (image[r][c] == initClr) {
            image[r][c] = clr;

            dfs(image, r - 1, c, clr, initClr);
            dfs(image, r + 1, c, clr, initClr);
            dfs(image, r, c - 1, clr, initClr);
            dfs(image, r, c + 1, clr, initClr);
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (color == image[sr][sc])
            return image;

        dfs(image, sr, sc, color, image[sr][sc]);

        return image;
    }
}