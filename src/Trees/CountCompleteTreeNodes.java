package Trees;

// https://leetcode.com/problems/count-complete-tree-nodes/ - Medium
// Runtime 0 ms Beats 100%
// Memory 45.1 MB Beats 83.64%
// January 13, 2023

public class CountCompleteTreeNodes {
    int n=0;
    public int countNodes(TreeNode root) {
        if(root==null){return n;}
        helper(root);
        return n;
    }
    void helper(TreeNode node){
        if(node==null){return;}
        n++;
        helper(node.left);
        helper(node.right);
    }
}