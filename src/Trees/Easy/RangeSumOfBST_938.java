package Trees.Easy;

// 938. Range Sum of BST
// https://leetcode.com/problems/range-sum-of-bst/
// Runtime 0 ms Beats 100.00%
// Memory 51.40 MB Beats 5.76%
// Jan 08, 2024

public class RangeSumOfBST_938 {
    public int rangeSumBST(TreeNode root, int low, int high) {
        return dfs(root, low, high);
    }

    int dfs(TreeNode n, int l, int h) {
        if (n == null) {
            return 0;
        }

        int sum = n.val <= h && n.val >= l ? n.val : 0;
        sum += n.val > l ? dfs(n.left, l, h) : 0;
        sum += n.val < h ? dfs(n.right, l, h) : 0;

        return sum;
    }
}