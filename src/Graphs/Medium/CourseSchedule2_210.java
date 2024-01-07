package Graphs.Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 210. Course Schedule II
// https://leetcode.com/problems/course-schedule-ii/
// Runtime 7 ms Beats 48.32%
// Memory 45.68 MB Beats 23.58%
// Jan 07, 2024

public class CourseSchedule2_210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjL = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adjL.add(new ArrayList<>());
        }

        int[] inDeg = new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            adjL.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        for (int i = 0; i < numCourses; i++) {
            for (int it : adjL.get(i)) {
                inDeg[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDeg[i] == 0) {
                q.add(i);
            }
        }
        int[] topo = new int[numCourses];
        int i = 0;
        while (!q.isEmpty()) {
            int node = q.remove();
            topo[i++] = node;
            for (int it : adjL.get(node)) {
                inDeg[it]--;
                if (inDeg[it] == 0) {
                    q.add(it);
                }
            }
        }
        if (i == numCourses) {
            return topo;
        }

        return new int[0];
    }
}