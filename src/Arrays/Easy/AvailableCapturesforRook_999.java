package Arrays.Easy;

// 999. Available Captures for Rook
// https://leetcode.com/problems/available-captures-for-rook/
// Runtime 0 ms Beats 100.00%
// Memory 39.79 MB Beats 61.09%
// December 12, 2023

public class AvailableCapturesforRook_999 {
    public int numRookCaptures(char[][] board) {
        int r = -1, c = -1;
        boolean found = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'R') {
                    r = i;
                    c = j;
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        int i = r - 1, ans = 0;
        while (i >= 0) {
            if (board[i][c] == 'p') {
                ans++;
                break;
            } else if (board[i][c] == 'B') {
                break;
            }
            i--;
        }
        i = r + 1;
        while (i < board.length) {
            if (board[i][c] == 'p') {
                ans++;
                break;
            } else if (board[i][c] == 'B') {
                break;
            }
            i++;
        }

        int j = c - 1;
        while (j >= 0) {
            if (board[r][j] == 'p') {
                ans++;
                break;
            } else if (board[r][j] == 'B') {
                break;
            }
            j--;
        }
        j = c + 1;
        while (j < board[0].length) {
            if (board[r][j] == 'p') {
                ans++;
                break;
            } else if (board[r][j] == 'B') {
                break;
            }
            j++;
        }

        return ans;
    }
}