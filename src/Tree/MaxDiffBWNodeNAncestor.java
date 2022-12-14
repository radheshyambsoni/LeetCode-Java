package Tree;

// https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/ - Medium
// Runtime 1 ms Beats 80.2%
// Memory 42.2 MB Beats 76.13%
// December 09, 2022 - Daily Challenge

public class MaxDiffBWNodeNAncestor {
    int ans;
    public int maxAncestorDiff(TreeNode root) {
        ans=0;
        helper(root,root.val,root.val);
        return ans;
    }
    private void helper(TreeNode node,int max,int min){
        int newMax=Math.max(max,node.val);
        int newMin=Math.min(min,node.val);
        ans=Math.max(ans,newMax-newMin);

        if(node.left!=null){
            helper(node.left, newMax, newMin);
        }
        if(node.right!=null){
            helper(node.right, newMax, newMin);
        }
    }   
}