package Trees.Easy;

// 2236. Root Equals Sum of Children
// https://leetcode.com/problems/root-equals-sum-of-children/
// Runtime 0 ms Beats 100%
// Memory 39.9 MB Beats 81.92%
// Feb 26, 2023

public class RootEqualsSumOfChildren_2236 {
    public boolean checkTree(TreeNode root) {
        return root.val==root.left.val+root.right.val;
    }
}