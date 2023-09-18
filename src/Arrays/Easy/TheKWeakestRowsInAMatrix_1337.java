package Arrays.Easy;

import java.util.PriorityQueue;

// 1337. The K Weakest Rows in a Matrix
// https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
// Runtime 2 ms Beats 80.96%
// Memory 44.5 MB Beats 75.35%
// Sep 18, 2023

public class TheKWeakestRowsInAMatrix_1337 {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length, n = mat[0].length;
        int[] freq = new int[m];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0])
                return a[1] - b[1];
            else
                return a[0] - b[0];
        });
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0)
                    break;
                freq[i]++;
            }
            pq.add(new int[] { freq[i], i });
        }

        int[] kWeak = new int[k];
        int size = Math.min(k, pq.size());
        for (int i = 0; i < size; i++) {
            kWeak[i] = pq.poll()[1];
        }

        return kWeak;
    }
}