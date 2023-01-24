package Trees.Easy;

import java.util.ArrayList;

// https://leetcode.com/problems/leaf-similar-trees/
// Runtime 0 ms Beats 100%
// Memory 40.1 MB Beats 90.96%
// December 08, 2022 - Daily Challenge

public class LeafSimilarTrees{
    ArrayList<Integer> t1=new ArrayList<>();
    ArrayList<Integer> t2=new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        addLeaves(root1,t1);
        addLeaves(root2,t2);
        return t1.equals(t2);
    }
    private void addLeaves(TreeNode root,ArrayList<Integer> t){
        if(root.left==null && root.right==null){
            t.add(root.val);
            return;
        }

        if(root.left!=null){
            addLeaves(root.left, t);
        }
        if(root.right!=null){
            addLeaves(root.right, t);
        }
    }
}