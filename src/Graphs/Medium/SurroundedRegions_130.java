package Graphs.Medium;

// 130. Surrounded Regions
// https://leetcode.com/problems/surrounded-regions/
// Runtime 1 ms Beats 99.81%
// Memory 44.40 MB Beats 26.45%
// Dec 02, 2023

public class SurroundedRegions_130 {
    void f(boolean[][] v, char[][] b, int i, int j) {
        if (i < 0 || i >= v.length || j < 0 || j >= v[0].length) {
            return;
        }
        if (!v[i][j] && b[i][j] == 'O') {
            v[i][j] = true;
            f(v, b, i - 1, j);
            f(v, b, i + 1, j);
            f(v, b, i, j - 1);
            f(v, b, i, j + 1);
        }
    }

    public void solve(char[][] board) {
        int m = board.length, n = board[0].length;
        boolean[][] v = new boolean[m][n];
        for (int j = 0; j < n; j++) {
            if (!v[0][j] && board[0][j] == 'O') {
                f(v, board, 0, j);
            }
            if (!v[m - 1][j] && board[m - 1][j] == 'O') {
                f(v, board, m - 1, j);
            }
        }
        for (int i = 0; i < m; i++) {
            if (!v[i][0] && board[i][0] == 'O') {
                f(v, board, i, 0);
            }
            if (!v[i][n - 1] && board[i][n - 1] == 'O') {
                f(v, board, i, n - 1);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!v[i][j]) {
                    board[i][j] = 'X';
                }
            }
        }
    }
}