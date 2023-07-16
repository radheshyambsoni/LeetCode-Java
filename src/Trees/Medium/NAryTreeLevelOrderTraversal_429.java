package Trees.Medium;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 429. N-ary Tree Level Order Traversal
// https://leetcode.com/problems/n-ary-tree-level-order-traversal/
// Runtime 3 ms Beats 80.79%
// Memory 43.5 MB Beats 66.97%
// May 12, 2023

public class NAryTreeLevelOrderTraversal_429 {
    public List<List<Integer>> levelOrder(Node root) {
        if(root==null) return new LinkedList<>();
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        List<List<Integer>> ans=new LinkedList<>();
        while(!q.isEmpty()){
            int level=q.size();
            List<Integer> l=new LinkedList<>();
            for(int i=0;i<level;i++){
                l.add(q.peek().val);
                List<Node> children=q.poll().children;
                for(Node j:children){
                    if(j!=null) q.offer(j);
                }
            }
            ans.add(l);
        }
        return ans;
    }
}