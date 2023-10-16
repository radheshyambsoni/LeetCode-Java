package DP.Easy;

import java.util.ArrayList;
import java.util.List;

// 119. Pascal's Triangle II
// https://leetcode.com/problems/pascals-triangle-ii/
// Runtime 0 ms Beats 100% 
// Memory 39.9 MB Beats 78.48%
// Oct 16, 2023

public class PascalTriangle2_119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        long prev = 1;
        ans.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            long curr = (prev * (rowIndex - i + 1)) / i;
            ans.add((int) curr);
            prev = curr;
        }

        return ans;
    }
}