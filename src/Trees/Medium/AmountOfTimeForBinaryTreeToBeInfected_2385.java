package Trees.Medium;

// 2385. Amount of Time for Binary Tree to Be Infected
// https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected/
// Runtime 9 ms Beats 94.32%
// Memory 79.88 MB Beats 53.06%
// Jan 10, 2023

public class AmountOfTimeForBinaryTreeToBeInfected_2385 {
    public int amountOfTime(TreeNode root, int start) {
        int[] ans = new int[1];
        f(root, start, ans);
        return ans[0];
    }

    int f(TreeNode n, int s, int[] ans) {
        if (n == null) {
            return 0;
        }

        int lDepth = f(n.left, s, ans);
        int rDepth = f(n.right, s, ans);

        if (n.val == s) {
            ans[0] = Math.max(lDepth, rDepth);
            return -1;
        } else if (lDepth >= 0 && rDepth >= 0) {
            return 1 + Math.max(lDepth, rDepth);
        }
        ans[0] = Math.max(ans[0], Math.abs(lDepth - rDepth));
        return Math.min(lDepth, rDepth) - 1;
    }
}