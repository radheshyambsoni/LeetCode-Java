package Trees.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// https://leetcode.com/problems/binary-tree-inorder-traversal/
// 94. Binary Tree Inorder Traversal
// Runtime 0 ms Beats 100%
// Memory 40.8 MB Beats 78.6%
// June 24, 2023

// Iterative solution
public class BinaryTreeInorderTraversal_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null) return new ArrayList<>();
        List<Integer> inorder=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        TreeNode node=root;
        while(true){
            if(node!=null){
                st.push(node);
                node=node.left;
            }else{
                if(st.isEmpty()) break;
                node=st.pop();
                inorder.add(node.val);
                node=node.right;
            }
        }
        
        return inorder;
    }
}

// // Runtime 0 ms Beats 100%
// // Memory 40.5 MB Beats 73.23%
// // January 13, 2023

// Recursive Solution
// public class BinaryTreeInorderTraversal {
//     List<Integer> ans=new ArrayList<>();
//     public List<Integer> inorderTraversal(TreeNode root) {
//         if(root==null){return new ArrayList<>();}
//         helper(root);
//         return ans;
//     }
//     void helper(TreeNode node){
//         if(node==null){
//             return;
//         }
//         helper(node.left);
//         ans.add(node.val);
//         helper(node.right);
//     }
// }