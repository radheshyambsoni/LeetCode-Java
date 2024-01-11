package Trees.Medium;

// 1026. Maximum Difference Between Node and Ancestor
// https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/
// Runtime 0 ms Beats 100.00%
// Memory 41.97 MB Beats 21.32%
// Jan 11, 2024

public class MaxDiffBWNodeNAncestor {
    public int maxAncestorDiff(TreeNode root) {
        int[] ans = new int[1];
        f(root, root.val, root.val, ans);
        return ans[0];
    }

    void f(TreeNode node, int max, int min, int[] ans) {
        int newMax = Math.max(max, node.val);
        int newMin = Math.min(min, node.val);
        ans[0] = Math.max(ans[0], newMax - newMin);

        if (node.left != null) {
            f(node.left, newMax, newMin, ans);
        }
        if (node.right != null) {
            f(node.right, newMax, newMin, ans);
        }
    }
}