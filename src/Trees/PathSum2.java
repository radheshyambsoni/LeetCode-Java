package Trees;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/path-sum-ii/ - Medium
// Runtime 1 ms Beats 100%
// Memory 42.6 MB Beats 85.96%
// January 16, 2023

public class PathSum2 {
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> temp=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null){return ans;}
        helper(root,targetSum);
        return ans;
    }
    void helper(TreeNode node,int sum){
        if(node.left==null && node.right==null){
            temp.add(node.val);
            if(sum==node.val){
                ans.add(new ArrayList<>(temp));
            }
            temp.remove(temp.size()-1);
            return;
        }
        temp.add(node.val);
        if(node.left!=null){helper(node.left,sum-node.val);}
        if(node.right!=null){helper(node.right,sum-node.val);}
        temp.remove(temp.size()-1);
    }
}