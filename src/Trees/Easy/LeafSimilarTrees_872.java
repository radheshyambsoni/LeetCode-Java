package Trees.Easy;

import java.util.ArrayList;
import java.util.List;

// 872. Leaf-Similar Trees
// https://leetcode.com/problems/leaf-similar-trees/
// Runtime 0 ms Beats 100.00%
// Memory 41.33 MB Beats 22.06%
// Jan 09, 2024

public class LeafSimilarTrees_872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        f(root1, l1);
        f(root2, l2);
        return l1.equals(l2);
    }

    void f(TreeNode n, List<Integer> l) {
        if (n.left == null && n.right == null) {
            l.add(n.val);
            return;
        }

        if (n.left != null) {
            f(n.left, l);
        }
        if (n.right != null) {
            f(n.right, l);
        }
    }
}
