package Trees.Easy;

// https://leetcode.com/problems/minimum-depth-of-binary-tree/ - Easy
// Runtime 7 ms Beats 79.14%
// Memory 95.7 MB Beats 7.53%
// January 21, 2023


public class MinDepthOfBinaryTree {
    int minD=100000;
    public int minDepth(TreeNode root){
        if(root==null){return 0;}
        helper(root,1);
        return minD;
    }
    void helper(TreeNode node,int h){
        if(node.left==null && node.right==null){
            minD=Math.min(h, minD);
        }

        if(node.left!=null){
            helper(node.left, h+1);
        }
        if(node.right!=null){
            helper(node.right, h+1);
        }
    }
}