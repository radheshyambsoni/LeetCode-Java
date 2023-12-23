package Strings.Easy;

import java.util.HashSet;

// 1496. Path Crossing
// https://leetcode.com/problems/path-crossing/
// Runtime 1 ms Beats 96.48%
// Memory 41.92 MB Beats 7.05%
// Dec 23, 2023

public class PathCrossing_1496 {
    public boolean isPathCrossing(String path) {
        HashSet<Pair<Integer, Integer>> set = new HashSet<>();
        int x = 0, y = 0;
        set.add(new Pair<>(0, 0));
        for (char c : path.toCharArray()) {
            if (c == 'N') {
                y++;
            } else if (c == 'E') {
                x++;
            } else if (c == 'S') {
                y--;
            } else {
                x--;
            }

            Pair<Integer, Integer> p = new Pair<>(x, y);
            if (set.contains(p)) {
                return true;
            } else {
                set.add(p);
            }
        }

        return false;
    }
}

// dummy class
class Pair<T, U> {
    T x;
    U y;

    Pair(T x, U y) {
        this.x = x;
        this.y = y;
    }
}