package Trees.Medium;

import java.util.LinkedList;
import java.util.Queue;

// 958. Check Completeness of a Binary Tree
// https://leetcode.com/problems/check-completeness-of-a-binary-tree/
// Runtime 1 ms Beats 90.21%
// Memory 42.6 MB Beats 6.14%
// May 13, 2023

public class CheckCompletenessOfABinaryTree_958 {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean flag=false;
        while(!q.isEmpty()){
            int level=q.size();
            for(int i=0;i<level;i++){
                TreeNode n=q.poll();
                if(n.left!=null){
                    if(flag) return false;
                    q.add(n.left);
                }else{
                    flag=true;
                }

                if(n.right!=null){
                    if(flag) return false;
                    q.add(n.right);
                }else{
                    flag=true;
                }
            }
        }
        return true;
    }
}