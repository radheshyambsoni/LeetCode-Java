package Trees;

// https://leetcode.com/problems/path-sum/ - Easy
// Runtime 0 ms Beats 100%
// Memory 42.5 MB Beats 69.79%
// January 01, 2023

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){return false;}
        if(root.left==null && root.right==null){
            return targetSum==root.val;
        }
        
        boolean left=hasPathSum(root.left,targetSum-root.val);
        if(left){return true;}
        return hasPathSum(root.right,targetSum-root.val);
    }    
}