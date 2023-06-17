package Trees.Medium;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

// 2583. Kth Largest Sum in a Binary Tree
// https://leetcode.com/problems/kth-largest-sum-in-a-binary-tree/
// Runtime 21 ms Beats 95.61%
// Memory 62.7 MB Beats 37.72%
// June 17, 2023

public class KthLargestSumInABinaryTree_2583 {
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        Queue<Long> sums=new PriorityQueue<>();
        sums.add((long)root.val);
        while(!q.isEmpty()){
            int size=q.size();
            long sum=0;
            for(int i=0;i<size;i++){
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
            if(q.isEmpty()) break;
            if(sums.size()<k){
                sums.offer(sum);
            }else if(sums.peek()<sum){
                sums.poll();
                sums.offer(sum);
            }
        }
        return sums.size()<k?-1l:sums.peek();
    }
}