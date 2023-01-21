package Trees.Easy;

// https://leetcode.com/problems/balanced-binary-tree/ - Easy
// Runtime 0 ms Beats 100%
// Memory 41.5 MB Beats 98.78%
// January 15, 2023

public class BalancedBinaryTree{
    public boolean isBalanced(TreeNode root) {
        return helper(root)!=-1;
    }
    int helper(TreeNode node){
        if(node==null){return 0;}

        int lh=helper(node.left);
        if(lh==-1){return -1;}
        int rh=helper(node.right);
        if(rh==-1){return -1;}

        if(Math.abs(lh-rh)>1){return -1;}
        return Math.max(lh,rh)+1;
    }
}