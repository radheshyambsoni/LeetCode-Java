package Trees.Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// https://leetcode.com/problems/binary-tree-level-order-traversal/ - Medium
// Runtime 1 ms Beats 84.25%
// Memory 42 MB Beats 98.47%
// January 13, 2023

public class BinaryTreeLevelOrderTraversal {
    List<List<Integer>> ans=new ArrayList<>();
    Queue<TreeNode> q=new LinkedList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){return ans;}
        q.add(root);
        while(!q.isEmpty()){
            int level=q.size();
            List<Integer> l=new ArrayList<>();
            for (int i=0;i<level;i++){
                if(q.peek().left!=null){q.offer(q.peek().left);}
                if(q.peek().right!=null){q.offer(q.peek().right);}
                l.add(q.poll().val);
            }
            ans.add(l);
        }
        return ans;
    }
}
