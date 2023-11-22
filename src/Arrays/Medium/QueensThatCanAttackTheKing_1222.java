package Arrays.Medium;

import java.util.ArrayList;
import java.util.List;

// 1222. Queens That Can Attack the King
// https://leetcode.com/problems/queens-that-can-attack-the-king/
// Runtime 1 ms Beats 91.08%
// Memory 42.38 MB Beats 10.19%
// Nov 22, 2023

public class QueensThatCanAttackTheKing_1222 {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        boolean[][] b = new boolean[8][8];

        for (int[] queen : queens) {
            b[queen[0]][queen[1]] = true;
        }

        List<List<Integer>> ans = new ArrayList<>();
        int[][] moves = { { -1, -1 }, { 0, -1 }, { 1, -1 }, { 1, 0 }, { 1, 1 }, { 0, 1 }, { -1, 1 }, { -1, 0 } };
        for (int i = 0; i < moves.length; i++) {
            int x = king[0] + moves[i][0];
            int y = king[1] + moves[i][1];
            while (x >= 0 && y >= 0 && x < 8 && y < 8) {
                if (b[x][y]) {
                    List<Integer> l = new ArrayList<>();
                    l.add(x);
                    l.add(y);
                    ans.add(l);
                    break;
                }
                x = x + moves[i][0];
                y = y + moves[i][1];
            }
        }

        return ans;
    }
}