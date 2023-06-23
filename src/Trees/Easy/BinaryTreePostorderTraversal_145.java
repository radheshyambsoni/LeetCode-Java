package Trees.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// https://leetcode.com/problems/binary-tree-postorder-traversal/
// 145. Binary Tree Postorder Traversal
// Runtime 0 ms Beats 100%
// Memory 41 MB Beats 44.52%
// June 24,2023

// Iterative Solution
public class BinaryTreePostorderTraversal_145{
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postOrder=new ArrayList<>();
        if(root==null) return postOrder;
        Stack<TreeNode> st=new Stack<>();
        TreeNode node=root;
        while(node!=null || !st.isEmpty()){
            if(node!=null){
                st.push(node);
                node=node.left;
            }else{
                TreeNode temp=st.peek().right;
                if(temp==null){
                    temp=st.pop();
                    postOrder.add(temp.val);
                    while(!st.isEmpty() && temp==st.peek().right){
                        temp=st.pop();
                        postOrder.add(temp.val);
                    }
                }else node=temp;
            }
        }
        return postOrder;
    }
}

// // Runtime 0 ms Beats 100%
// // Memory 40.3 MB Beats 94.30%
// // January 13, 2023

// Recursive Solution
// public class BinaryTreePostorderTraversal {
//     List<Integer> ans=new ArrayList<>();
//     public List<Integer> postorderTraversal(TreeNode root) {
//         if(root==null){return ans;}
//         helper(root);
//         return ans;
//     }
//     void helper(TreeNode node){
//         if(node==null){
//             return;
//         }
//         helper(node.left);
//         helper(node.right);
//         ans.add(node.val);
//     }
// }