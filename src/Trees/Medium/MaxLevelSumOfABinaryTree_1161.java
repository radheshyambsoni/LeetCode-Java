package Trees.Medium;

import java.util.LinkedList;
import java.util.Queue;

// 1161. Maximum Level Sum of a Binary Tree
// https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/
// Runtime 8 ms Beats 96.46%
// Memory 46.2 MB Beats 54.10%
// Jun 15, 2023

public class MaxLevelSumOfABinaryTree_1161 {
    public int maxLevelSum(TreeNode root) {
        if(root.left==null && root.right==null) return root.val;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int max=root.val,level=1,ans=1;
        while(!q.isEmpty()){
            int l=q.size();
            int sum=0;
            for(int i=0;i<l;i++){
                TreeNode n=q.poll();
                if(n.left!=null){
                    q.offer(n.left);
                    sum+=n.left.val;
                }
                if(n.right!=null){
                    q.offer(n.right);
                    sum+=n.right.val;
                }
            }
            if(!q.isEmpty()){
                level++;
                if(sum>max){
                    max=sum;
                    ans=level;
                }
            }
        }
        return ans;
    }
}