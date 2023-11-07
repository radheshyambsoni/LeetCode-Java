package Arrays.Medium;

import java.util.Arrays;

// 1921. Eliminate Maximum Number of Monsters
// https://leetcode.com/problems/eliminate-maximum-number-of-monsters/
// Runtime 18 ms Beats 77.60%
// Memory 54.60 MB Beats 83.33%
// Nov 07, 2023

public class EliminateMaxNumOfMonsters_1921 {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;

        // Calculating time required for each monster to reach the city
        for (int i = 0; i < n; i++) {
            dist[i] = (int) Math.ceil((double) dist[i] / speed[i]);
        }

        Arrays.sort(dist);

        int time = 0;
        for (int j = 0; j < n; j++) {
            if (time >= dist[j]) {
                return time;
            }
            time++;
        }

        return n;
    }
}