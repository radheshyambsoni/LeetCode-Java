package Trees.Easy;

// 965. Univalued Binary Tree
// https://leetcode.com/problems/univalued-binary-tree/
// Runtime 0 ms Beats 100%
// Memory 39.9 MB Beats 73.12%
// February 02, 2023

public class UnivaluedBinaryTree {
    public boolean isUnivalTree(TreeNode root) {
        return helper(root,root.val);
    }
    boolean helper(TreeNode node,int val){
        if(node==null){return true;}
        if(node.val!=val){return false;}
        return helper(node.left,val) && helper(node.right,val);
    }
}