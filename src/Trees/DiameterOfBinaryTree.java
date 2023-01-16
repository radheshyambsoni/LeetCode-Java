package Trees;

// https://leetcode.com/problems/diameter-of-binary-tree/ - Easy
// Runtime 0 ms Beats 100%
// Memory 42 MB Beats 79.47%
// January 16, 2023

public class DiameterOfBinaryTree {
    int dia=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){return dia;}
        helper(root);
        return dia;
    }
    int helper(TreeNode node){
        if(node==null){return 0;}

        int lh=helper(node.left);
        int rh=helper(node.right);
        dia=Math.max(dia,lh+rh);
        
        return 1+Math.max(lh,rh);
    }
}