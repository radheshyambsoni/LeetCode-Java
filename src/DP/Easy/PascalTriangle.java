package DP.Easy;

import java.util.ArrayList;
import java.util.List;

// 118. Pascal's Triangle
// https://leetcode.com/problems/pascals-triangle/
// Runtime 0 ms Beats 100%
// Memory 41.4 MB Beats 11.32%
// Jul 26, 2023

public class PascalTriangle {
    List<Integer> nCr(int n) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        int val = 1;
        for (int i = 1; i < n; i++) {
            val = (val * (n - i)) / i;
            l.add(val);
        }
        return l;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            ans.add(nCr(i));
        }
        return ans;
    }
}