package Trees.Medium;

import java.util.ArrayList;
import java.util.List;

// 1305. All Elements in Two Binary Search Trees
// https://leetcode.com/problems/all-elements-in-two-binary-search-trees/
// Runtime 14 ms Beats 91.16%
// Memory 46.55 MB Beats 6.15%
// Dec 28, 2023

public class AllElementsInTwoBinarySearchTrees_1305 {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        f(root1, l1);
        f(root2, l2);

        List<Integer> l = new ArrayList<>();
        int i = 0, j = 0, m = l1.size(), n = l2.size();
        while (i < m && j < n) {
            int e1 = l1.get(i);
            int e2 = l2.get(j);
            if (e1 <= e2) {
                l.add(e1);
                i++;
            } else {
                l.add(e2);
                j++;
            }
        }
        while (i < m) {
            l.add(l1.get(i++));
        }
        while (j < n) {
            l.add(l2.get(j++));
        }

        return l;
    }

    void f(TreeNode n, List<Integer> l) {
        if (n == null) {
            return;
        }

        f(n.left, l);
        l.add(n.val);
        f(n.right, l);
    }
}