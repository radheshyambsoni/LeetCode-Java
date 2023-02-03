package Trees.Easy;

// 226. Invert Binary Tree
// https://leetcode.com/problems/invert-binary-tree/
// Runtime 0 ms Beats 100%
// Memory 40.2 MB Beats 36.34%
// February 03, 2023

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){return root;}
        helper(root);
        return root;
    }
    void helper(TreeNode node){        
        TreeNode temp=node.left;
        node.left=node.right;
        node.right=temp;
        if(node.left!=null){
            helper(node.left);
        }
        if(node.right!=null){
            helper(node.right);
        }
    }
}