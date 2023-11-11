package Graphs.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

// 2642. Design Graph With Shortest Path Calculator
// https://leetcode.com/problems/design-graph-with-shortest-path-calculator/
// Runtime 85 ms Beats 89.81%
// Memory 54.78 MB Beats 43.52%
// Nov 11, 2023

// IMPORTANT CONCEPT - Dijkstra's algorithm and priority queue (min heap here)
class Graph {
    List<List<int[]>> adjL;

    public Graph(int n, int[][] edges) {
        adjL = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adjL.add(new ArrayList<>());
        }

        for (int[] e : edges) {
            addEdge(e);
        }
    }

    public void addEdge(int[] e) {
        int[] edgeArray = { e[1], e[2] };
        adjL.get(e[0]).add(edgeArray);
    }

    public int shortestPath(int node1, int node2) {
        return dijkstra(node1, node2);
    }

    // Dijkstra's algorithm is the most suitable as we have shortest
    // path between two nodes of directed graph with positive weights
    int dijkstra(int start, int end) {
        int n = adjL.size();
        int[] dists = new int[n];
        Arrays.fill(dists, Integer.MAX_VALUE);
        dists[start] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));
        pq.add(new int[] { 0, start });

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int currNode = curr[1], currCost = curr[0];

            if (currCost > dists[currNode])
                continue;

            if (currNode == end)
                return currCost;

            for (int[] e : adjL.get(currNode)) {
                int neighbor = e[0], eLen = e[1];
                int newRouteCost = eLen + dists[currNode];

                if (dists[neighbor] > newRouteCost) {
                    dists[neighbor] = newRouteCost;
                    pq.add(new int[] { newRouteCost, neighbor });
                }
            }
        }

        return ((dists[end] == Integer.MAX_VALUE) ? -1 : dists[end]);
    }
}
