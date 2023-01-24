package Trees.Easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-postorder-traversal/
// Runtime 0 ms Beats 100%
// Memory 40.3 MB Beats 94.30%
// January 13, 2023

public class BinaryTreePostorderTraversal {
    List<Integer> ans=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null){return ans;}
        helper(root);
        return ans;
    }
    void helper(TreeNode node){
        if(node==null){
            return;
        }
        helper(node.left);
        helper(node.right);
        ans.add(node.val);
    }
}