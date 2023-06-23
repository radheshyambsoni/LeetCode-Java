package Trees.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 144. Binary Tree Preorder Traversal
// https://leetcode.com/problems/binary-tree-preorder-traversal/
// Runtime 0 ms Beats 100%
// Memory 41 MB Beats 45.52%
// June 24, 2023

// Iterative Solution
public class BinaryTreePreorderTraversal_144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null) return new ArrayList<>();
        List<Integer> preorder=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode temp=st.pop();
            preorder.add(temp.val);
            if(temp.right!=null) st.push(temp.right);
            if(temp.left!=null) st.push(temp.left);
        }
        return preorder;
    }
}

// Runtime 0 ms Beats 100%
// // Memory 40.4 MB Beats 81.74%
// // January 09, 2023 - Daily Challenge

// Recursive Solution
// public class BinaryTreePreorderTraversal{
    //     List<Integer> ans=new ArrayList<>();
//     public List<Integer> preorderTraversal(TreeNode root) {
//         if(root==null){return new ArrayList<>();}
//         helper(root);
//         return ans;
//     }
//     void helper(TreeNode node){
//         if(node==null){return;}

//         ans.add(node.val);
//         helper(node.left);
//         helper(node.right);
//     }
// }