package Trees.Medium;

import java.util.LinkedList;

// 116. Populating Next Right Pointers in Each Node
// https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
// Runtime 9 ms Beats 5.99%
// Memory 42.5 MB Beats 62.90%
// Mar 31, 2023


public class PopulatingNextRightPtrsInEachNode_116 {
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
        root.next=null;
        LinkedList<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int level=q.size();
            for(int i=0;i<level;i++){
                Node node=q.poll();
                if(node.left!=null){q.add(node.left);}
                if(node.right!=null){q.add(node.right);}
            }
            if(q.isEmpty()) break;
            Node temp=q.peek();
            for(int i=1;i<q.size();i++){
                temp.next=q.get(i);
                temp=temp.next;
            }
        }
        return root;
    }
}