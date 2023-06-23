package Trees.Hard;

// 124. BinaryTreeMaxPathSum_124
// https://leetcode.com/problems/binary-tree-maximum-path-sum/
// Runtime 1 ms Beats 91.24%
// Memory 43.3 MB  Beats 99.76%
// June 23, 2023

public class BinaryTreeMaxPathSum_124 {
    int max=-10000;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }
    int helper(TreeNode node){
        if(node == null) {
            return 0;
        }

        int leftSum = node.left==null?-1000:helper(node.left);
        int rightSum = node.right==null?-1000:helper(node.right);
        
        int max1 = leftSum + rightSum + node.val;        

        int retMax=Math.max(node.val, node.val+Math.max(leftSum, rightSum));

        max=Math.max(max, Math.max(retMax, Math.max(max1, Math.max(leftSum, rightSum))));
        return retMax;
    }
}