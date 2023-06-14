package Trees.Easy;

// 617. Merge Two Binary Trees
// https://leetcode.com/problems/merge-two-binary-trees/
// Runtime 0 ms Beats 100%
// Memory 43.9 MB Beats 20.35%
// Jun 14, 2023

public class Merge2BinaryTrees_617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null) return null;
        else if(root1==null) return root2;
        else if(root2==null) return root1;
        helper(root1, root2);
        return root1;
    }

    void helper(TreeNode n1, TreeNode n2){
        n1.val+=n2!=null?n2.val:0;

        if(n1.left!=null){
            if(n2.left!=null){
                helper(n1.left,n2.left);
            }
        }else{
            n1.left=n2.left;
        }

        if(n1.right!=null){
            if(n2.right!=null){
                helper(n1.right,n2.right);
            }
        }else{
            n1.right=n2.right;
        }
    }
}