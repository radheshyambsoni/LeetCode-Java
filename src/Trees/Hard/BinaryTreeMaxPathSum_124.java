package Trees.Hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 124. BinaryTreeMaxPathSum_124
// https://leetcode.com/problems/binary-tree-maximum-path-sum/
// Runtime 0 ms Beats 100%
// Memory 41 MB Beats 45.30%
// June 24, 2023

public class BinaryTreeMaxPathSum_124 {
    // Iterative solution
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

// // Runtime 1 ms Beats 91.24%
// // Memory 43.3 MB  Beats 99.76%
// // June 23, 2023

// Recursive solution
// public class BinaryTreeMaxPathSum_124 {
//     int max=-10000;
//     public int maxPathSum(TreeNode root) {
//         helper(root);
//         return max;
//     }
//     int helper(TreeNode node){
//         if(node == null) {
//             return 0;
//         }

//         int leftSum = node.left==null?-1000:helper(node.left);
//         int rightSum = node.right==null?-1000:helper(node.right);
        
//         int max1 = leftSum + rightSum + node.val;        

//         int retMax=Math.max(node.val, node.val+Math.max(leftSum, rightSum));

//         max=Math.max(max, Math.max(retMax, Math.max(max1, Math.max(leftSum, rightSum))));
//         return retMax;
//     }
// }