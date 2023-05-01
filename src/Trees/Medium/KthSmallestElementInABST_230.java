package Trees.Medium;

// 230. Kth Smallest Element in a BST
// https://leetcode.com/problems/kth-smallest-element-in-a-bst/
// Runtime 0 ms Beats 100%
// Memory 42.9 MB Beats 29.10%
// May 01, 2023

public class KthSmallestElementInABST_230 {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> l=new LinkedList<>();
        helper(root,l,k);
        return l.get(k-1);
    }
    void helper(TreeNode node,List<Integer> l,int k){
        if(node.left==null && node.right==null){
            l.add(node.val);
            return;
        }
        if(node.left!=null){
            helper(node.left,l,k);
        }
        if(l.size()==k) return;
        l.add(node.val);
        if(l.size()==k) return;
        if(node.right!=null){
            helper(node.right,l,k);
        }
    }
}
