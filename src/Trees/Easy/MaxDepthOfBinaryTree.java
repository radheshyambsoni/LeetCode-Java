package Trees.Easy;

// 104. Maximum Depth of Binary Tree
// https://leetcode.com/problems/maximum-depth-of-binary-tree/
// Runtime 0 ms Beats 100%
// Memory 42.5 MB Beats 35.83%
// January 31, 2023

public class MaxDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root==null){return 0;}
        if(root.left==null && root.right==null){
            return 1;
        }        
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}