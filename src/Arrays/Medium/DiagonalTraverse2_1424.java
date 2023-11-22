package Arrays.Medium;

import java.util.ArrayList;
import java.util.List;

// 1424. Diagonal Traverse II
// https://leetcode.com/problems/diagonal-traverse-ii/
// Runtime 15 ms Beats 99.47%
// Memory 61.48 MB Beats 96.19%
// Nov 22, 2023

public class DiagonalTraverse2_1424 {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        int cnt = 0;
        List<List<Integer>> d = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            List<Integer> row = nums.get(i);
            for (int j = 0; j < row.size(); j++) {
                int idx = i + j;
                if (d.size() < idx + 1) {
                    d.add(new ArrayList<>());
                }
                d.get(idx).add(row.get(j));

                cnt++;
            }
        }

        int[] ans = new int[cnt];
        int idx = 0;
        for (List<Integer> l : d) {
            for (int i = l.size() - 1; i >= 0; i--) {
                ans[idx++] = l.get(i);
            }
        }

        return ans;
    }
}