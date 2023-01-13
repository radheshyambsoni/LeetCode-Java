package Trees;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-inorder-traversal/ - Easy
// Runtime 0 ms Beats 100%
// Memory 40.5 MB Beats 73.23%
// January 13, 2023

public class BinaryTreeInorderTraversal {
    List<Integer> ans=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null){return new ArrayList<>();}
        helper(root);
        return ans;
    }
    void helper(TreeNode node){
        if(node==null){
            return;
        }
        helper(node.left);
        ans.add(node.val);
        helper(node.right);
    }
}