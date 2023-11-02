package Trees.Medium;

// 2265. Count Nodes Equal to Average of Subtree
// https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/
// Runtime 0 ms Beats 100.00%
// Memory 42.39 MB Beats 97.65%
// Nov 02, 2023

public class CountNodesEqualToAvgOfSubtree_2265 {
    public int averageOfSubtree(TreeNode root) {
        int[] ans = dfs(root);
        return ans[2];
    }

    // int[3] => {sum of values in that subtree, number of nodes in that subtree,
    // number of nodes that are equal to average of that subtree}
    int[] dfs(TreeNode node) {
        if (node == null) {
            return new int[] { 0, 0, 0 };
        }
        if (node.left == null && node.right == null) {
            return new int[] { node.val, 1, 1 };
        }

        int[] left = dfs(node.left);
        int[] right = dfs(node.right);

        left[0] += right[0] + node.val;
        left[1] += right[1] + 1;
        left[2] += right[2];

        if (node.val == (left[0] / left[1])) {
            left[2] += 1;
        }

        return left;
    }
}