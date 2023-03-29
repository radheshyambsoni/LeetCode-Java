package Trees.Medium;

import java.util.ArrayList;

// 114. Flatten Binary Tree to Linked List
// https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
// Runtime 1 ms Beats 25.17%
// Memory 42.2 MB Beats 42.38%
// Mar 29, 2023

public class FlattenBinaryTree2LinkedList_114 {
    ArrayList<Integer> l=new ArrayList<>();
    public void flatten(TreeNode root) {
        if(root==null) return;
        preorder(root);
        root.left=null;
        TreeNode temp=root,prev=null;
        for(int i:l){
            temp.val=i;
            prev=temp;
            temp.right=new TreeNode();
            temp=temp.right;
        }
        prev.right=null;
    }
    void preorder(TreeNode node){
        if(node.left==null && node.right==null){
            l.add(node.val);
            return;
        }
        l.add(node.val);
        if(node.left!=null){
            preorder(node.left);
        }
        if(node.right!=null){
            preorder(node.right);
        }
    }
}