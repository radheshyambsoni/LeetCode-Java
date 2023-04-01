package Trees.Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 107. Binary Tree Level Order Traversal II
// https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
// Runtime 1 ms Beats 92.80%
// Memory 42.9 MB Beats 27.50%
// Apr 01, 2023

public class BinaryTreeLevelOrderTraversal2_107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null) return new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            int level=q.size();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<level;i++){
                TreeNode temp=q.poll();
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
                l.add(temp.val);
            }
            ans.add(0,l);
        }
        return ans;
    }
}