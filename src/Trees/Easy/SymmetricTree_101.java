package Trees.Easy;

// 101. Symmetric Tree
// https://leetcode.com/problems/symmetric-tree/
// Runtime 0 ms Beats 100%
// Memory 40.3 MB Beats 77.62%
// February 20, 2023

public class SymmetricTree_101 {
    public boolean isSymmetric(TreeNode root) {
        return helper(root,root);
    }
    boolean helper(TreeNode node1,TreeNode node2){
        if(node1!=null){
            if(node2!=null){
                if(node1.val==node2.val){
                    return helper(node1.left,node2.right) && helper(node1.right, node2.left);
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            if(node2!=null){
                return false;
            }else{
                return true;
            }
        }
    }
}