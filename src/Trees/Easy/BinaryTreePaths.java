package Trees.Easy;

import java.util.ArrayList;
import java.util.List;

// 257. Binary Tree Paths
// https://leetcode.com/problems/binary-tree-paths/
// Runtime 9 ms Beats 59.20%
// Memory 42.3 MB Beats 86.47%
// February 05, 2023

public class BinaryTreePaths {    
    List<String> ans=new ArrayList<>();    
    public List<String> binaryTreePaths(TreeNode root) {        
        helper(root,"");
        return ans;
    }
    void helper(TreeNode root,String p) {
        p+=root.val;
        if(root.left==null && root.right==null){
            ans.add(p);
            return;
        }
        p+="->";
        if(root.left!=null){
            helper(root.left,p);
        }
        if(root.right!=null){
            helper(root.right,p);
        }
    }
}