package Trees;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-preorder-traversal/ - Easy
// Runtime 0 ms Beats 100%
// Memory 40.4 MB Beats 81.74%
// January 09, 2023 - Daily Challenge

public class BinaryTreePreorderTraversal{
    List<Integer> ans=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){return new ArrayList<>();}
        helper(root);
        return ans;
    }
    void helper(TreeNode node){
        if(node==null){return;}

        ans.add(node.val);
        helper(node.left);
        helper(node.right);
    }
}