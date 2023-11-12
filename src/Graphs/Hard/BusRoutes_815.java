package Graphs.Hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 815. Bus Routes
// https://leetcode.com/problems/bus-routes/
// Runtime 699 ms Beats 37.82%
// Memory 73.95 MB Beats 46.16%
// Nov 12, 2023

public class BusRoutes_815 {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if (source == target) {
            return 0;
        }

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < routes.length; i++) {
            for (int stop : routes[i]) {
                if (map.containsKey(stop)) {
                    map.get(stop).add(i);
                } else {
                    List<Integer> l = new ArrayList<>();
                    l.add(i);
                    map.put(stop, l);
                }
            }
        }

        HashSet<Integer> v = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.offer(source);
        int buses = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                int stop = q.poll();
                if (stop == target)
                    return buses;
                for (int i : map.get(stop)) {
                    if (v.contains(i)) {
                        continue;
                    }
                    v.add(i);
                    for (int next : routes[i]) {
                        q.offer(next);
                    }
                }
            }
            buses++;
        }

        return -1;
    }
}