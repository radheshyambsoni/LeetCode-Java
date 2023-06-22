package Trees.Medium;

import java.util.HashSet;

// 1261. Find Elements in a Contaminated Binary Tree
// https://leetcode.com/problems/find-elements-in-a-contaminated-binary-tree/
// Runtime 23 ms Beats 95.44%
// Memory 49.3 MB Beats 9.12%

class FindElements {
    HashSet<Integer> set;
    public FindElements(TreeNode root) {
        set=new HashSet<>();
        root.val=0;
        set.add(0);
        recover(root);
    }

    void recover(TreeNode node){
        if(node.left!=null){
            node.left.val=2*node.val+1;
            set.add(node.left.val);
            recover(node.left);
        }
        if(node.right!=null){
            node.right.val=2*node.val+2;
            set.add(node.right.val);
            recover(node.right);
        }
    }
    
    public boolean find(int target) {
        return set.contains(target);
    }
}