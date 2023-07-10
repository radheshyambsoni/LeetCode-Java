package Trees.Easy;

import java.util.LinkedList;
import java.util.Queue;

// 111. Minimum Depth of Binary Tree
// https://leetcode.com/problems/minimum-depth-of-binary-tree/
// Runtime 1 ms Beats 99.26%
// Memory 61.3 MB Beats 88.6%
// Jul 10, 2023

// BFS
public class MinDepthOfBinaryTree_111 {
    public int minDepth(TreeNode root){
        if(root==null){return 0;}
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int minD=0;

        while(!q.isEmpty()){
            int size=q.size();
            minD++;
            for(int i=0;i<size;i++){
                TreeNode n=q.poll();
                if(n.left==null && n.right==null) return minD;

                if(n.left!=null){
                    q.offer(n.left);
                }
                if(n.right!=null){
                    q.offer(n.right);
                }
            }
        }
        return minD;
    }
}

// DFS
// // Runtime 2 ms Beats 81.71%
// // Memory 62.2 MB Beats 69.67%
// // Jul 10, 2023

// public class MinDepthOfBinaryTree_111 {
//     int minD=100000;
//     public int minDepth(TreeNode root){
//         if(root==null){return 0;}
//         helper(root,1);
//         return minD;
//     }
//     void helper(TreeNode node,int h){
//         if(node.left==null && node.right==null){
//             minD=Math.min(h, minD);
//         }

//         if(node.left!=null){
//             helper(node.left, h+1);
//         }
//         if(node.right!=null){
//             helper(node.right, h+1);
//         }
//     }
// }