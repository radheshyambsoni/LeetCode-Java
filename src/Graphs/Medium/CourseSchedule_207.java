package Graphs.Medium;

import java.util.ArrayList;
import java.util.List;

// 207. Course Schedule
// https://leetcode.com/problems/course-schedule/
// Runtime 3 ms Beats 95.18% 
// Memory 44.19 MB Beats 48.69%
// Dec 03, 2023

public class CourseSchedule_207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        return !isCyclic(numCourses, prerequisites);
    }

    boolean isCyclic(int n, int[][] g) {
        List<List<Integer>> adjL = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjL.add(new ArrayList<>());
        }
        for (int[] arr : g) {
            adjL.get(arr[0]).add(arr[1]);
        }

        boolean[] v = new boolean[n];
        boolean[] recStack = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (dfs(i, v, recStack, adjL)) {
                return true;
            }
        }

        return false;
    }

    boolean dfs(int curr, boolean[] v, boolean[] r, List<List<Integer>> adjL) {
        if (r[curr]) {
            return true;
        }
        if (v[curr]) {
            return false;
        }

        v[curr] = true;
        r[curr] = true;

        for (int node : adjL.get(curr)) {
            if (dfs(node, v, r, adjL)) {
                return true;
            }
        }

        r[curr] = false;

        return false;
    }
}