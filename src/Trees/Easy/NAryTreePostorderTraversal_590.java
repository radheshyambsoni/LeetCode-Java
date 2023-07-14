package Trees.Easy;

import java.util.ArrayList;
import java.util.List;

// 590. N-ary Tree Postorder Traversal
// https://leetcode.com/problems/n-ary-tree-postorder-traversal/
// Runtime 1ms Beats 83.52%
// Memory 44.65mb Beats 31.61%
// Jul 14, 2023

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class NAryTreePostorderTraversal_590 {
    public List<Integer> postorder(Node root) {
        List<Integer> post=new ArrayList<>();
        if(root==null) return post;
        helper(root,post);
        return post;
    }
    void helper(Node node,List<Integer> post){
        for(Node n:node.children){
            if(n!=null){
                helper(n, post);
            }
        }
        post.add(node.val);
    }
}