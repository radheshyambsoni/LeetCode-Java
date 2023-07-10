package Trees.Easy;

// 111. Minimum Depth of Binary Tree
// https://leetcode.com/problems/minimum-depth-of-binary-tree/
// Runtime 2 ms Beats 81.71%
// Memory 62.2 MB Beats 69.67%
// Jul 10, 2023

public class MinDepthOfBinaryTree_111 {
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