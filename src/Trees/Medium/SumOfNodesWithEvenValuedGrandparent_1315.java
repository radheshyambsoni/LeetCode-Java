package Trees.Medium;

// 1315. Sum of Nodes with Even-Valued Grandparent
// https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/
// Runtime 1 ms Beats 100%
// Memory 44.4 MB Beats 58.32%
// Feb 19, 2023

public class SumOfNodesWithEvenValuedGrandparent_1315 {
    int sum = 0;

    public int sumEvenGrandparent(TreeNode root) {
        if (root.left != null) {
            if (root.left.left != null) {
                helper(root.left.left, root.val % 2 == 0, root.left.val % 2 == 0);
            }
            if (root.left.right != null) {
                helper(root.left.right, root.val % 2 == 0, root.left.val % 2 == 0);
            }
        }
        if (root.right != null) {
            if (root.right.left != null) {
                helper(root.right.left, root.val % 2 == 0, root.right.val % 2 == 0);
            }
            if (root.right.right != null) {
                helper(root.right.right, root.val % 2 == 0, root.right.val % 2 == 0);
            }
        }
        return sum;
    }

    void helper(TreeNode node, boolean gp, boolean p) {
        if (node.left == null && node.right == null) {
            if (gp) {
                sum += node.val;
            }
            return;
        }
        if (gp) {
            sum += node.val;
        }
        gp = p;
        p = node.val % 2 == 0;
        if (node.left != null) {
            helper(node.left, gp, p);
        }
        if (node.right != null) {
            helper(node.right, gp, p);
        }
    }
}