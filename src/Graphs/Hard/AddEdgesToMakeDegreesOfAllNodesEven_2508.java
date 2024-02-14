package Graphs.Hard;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 2508. Add Edges to Make Degrees of All Nodes Even
// https://leetcode.com/problems/add-edges-to-make-degrees-of-all-nodes-even/
// Runtime 67 ms Beats 77.27%
// Memory 100.89 MB Beats 54.54%
// Feb 14, 2024

public class AddEdgesToMakeDegreesOfAllNodesEven_2508 {
    public boolean isPossible(int n, List<List<Integer>> edges) {
        List<Set<Integer>> adjL = new ArrayList<>();
        int[] deg = new int[n + 1];

        for (int i = 0; i < n; i++) {
            adjL.add(new HashSet<>());
        }

        for (List<Integer> e : edges) {
            int a = e.get(0);
            int b = e.get(1);

            adjL.get(a - 1).add(b);
            adjL.get(b - 1).add(a);
            deg[a]++;
            deg[b]++;
        }

        List<Integer> odd = new ArrayList<>();
        int oddCnt = 0;
        for (int i = 0; i <= n; i++) {
            if (deg[i] % 2 == 1) {
                odd.add(i);
                oddCnt++;
            }
        }

        if (oddCnt == 1 || oddCnt == 3 || oddCnt > 4) {
            return false;
        }

        if (oddCnt == 0) {
            return true;
        }
        int a = odd.get(0), b = odd.get(1);
        if (oddCnt == 2) {
            if (!adjL.get(a - 1).contains(b) && !adjL.get(b - 1).contains(a)) {
                return true;
            }

            for (Set<Integer> s : adjL) {
                if (!s.contains(a) && !s.contains(b)) {
                    return true;
                }
            }

            return false;
        }

        int c = odd.get(2), d = odd.get(3);

        Set<Integer> A = adjL.get(a - 1), B = adjL.get(b - 1), C = adjL.get(c - 1), D = adjL.get(d - 1);
        return (!A.contains(b) && !B.contains(a) && !C.contains(d) && !D.contains(c)) ||
                (!A.contains(c) && !C.contains(a) && !B.contains(d) && !D.contains(b)) ||
                (!A.contains(d) && !D.contains(a) && !B.contains(c) && !C.contains(b));
    }
}