package Trees.Medium;

import java.util.LinkedList;
import java.util.Queue;

// 117. Populating Next Right Pointers in Each Node II
// https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/
// Runtime 1 ms Beats 69.31%
// Memory 42.4 MB Beats 35.9%
// Apr 30, 2023

public class PopulatingNextRightPointersInEachNode2_117 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;
    
        public Node() {}
        
        public Node(int _val) {
            val = _val;
        }
    
        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
    
    public Node connect(Node root) {
        if(root==null) return null;
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        Node prev=null;
        while(!q.isEmpty()){
            int l=q.size();
            for(int i=0;i<l;i++){
                Node n=q.poll();
                if(i>0) prev.next=n;
                if(n.left!=null){
                    q.offer(n.left);
                }
                if(n.right!=null){
                    q.offer(n.right);
                }
                prev=n;
            }
        }
        return root;
    }
}
