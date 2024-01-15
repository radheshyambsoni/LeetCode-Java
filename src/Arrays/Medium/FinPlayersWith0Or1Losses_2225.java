package Arrays.Medium;

import java.util.ArrayList;
import java.util.List;

// 2225. Find Players With Zero or One Losses
// https://leetcode.com/problems/find-players-with-zero-or-one-losses/
// Runtime 25 ms Beats 99.08%
// Memory 96.50 MB Beats 50.41%
// Jan 15, 2025

public class FinPlayersWith0Or1Losses_2225 {
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] lossCnt = new int[100001];
        for (int[] m : matches) {
            int winner = m[0], loser = m[1];

            if (lossCnt[winner] == 0) {
                lossCnt[winner] = -1;
            }

            if (lossCnt[loser] == -1) {
                lossCnt[loser] = 1;
            } else {
                lossCnt[loser]++;
            }
        }

        List<Integer> zeroL = new ArrayList<>();
        List<Integer> oneL = new ArrayList<>();
        for (int i = 0; i < 100001; i++) {
            int cnt = lossCnt[i];
            if (cnt == -1) {
                zeroL.add(i);
            } else if (cnt == 1) {
                oneL.add(i);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(zeroL);
        ans.add(oneL);

        return ans;
    }
}