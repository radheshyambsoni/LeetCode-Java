package Trees.Medium;

// 1325. Delete Leaves With a Given Value
// https://leetcode.com/problems/delete-leaves-with-a-given-value/
// Runtime 0 ms Beats 100%
// Memory 42.8 MB Beats 11.76%

public class DeleteLeavesWithAGivenVal_1325 {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        return helper(root,target)?null:root;
    }
    boolean helper(TreeNode node,int t){
        if(node==null) return true;
        if(node.left==null && node.right==null){
            if(node.val==t){
                return true;
            }
            return false;
        }

        if(helper(node.left,t)) node.left=null;
        if(helper(node.right,t)) node.right=null;

        if(node.left==null && node.right==null){
            if(node.val==t){
                return true;
            }
            return false;
        }
        return false;
    }
}