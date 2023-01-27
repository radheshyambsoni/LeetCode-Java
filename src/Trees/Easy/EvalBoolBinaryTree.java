package Trees.Easy;

// 2331. Evaluate Boolean Binary Tree
// https://leetcode.com/problems/evaluate-boolean-binary-tree/
// Runtime 0 ms Beats 100%
// Memory 46.1 MB Beats 30.57%
// January 27, 2023

public class EvalBoolBinaryTree {
    public boolean evaluateTree(TreeNode root) {
        return helper(root);
    }
    boolean helper(TreeNode node){
        if(node.left==null && node.right==null){
            if(node.val==0){
                return false;
            }
            return true;
        }
        boolean left=true;
        if(node.left!=null){
            left=helper(node.left);
        }
        boolean right=true;
        if(node.right!=null){
            right=helper(node.right);
        }
        
        if(node.val==2){
            return left || right;
        }
        return left && right;
    }
}