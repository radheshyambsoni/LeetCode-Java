package Trees.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 589. N-ary Tree Preorder Traversal
// https://leetcode.com/problems/n-ary-tree-preorder-traversal/description/
// Runtime 3 ms Beats 29.70%
// Memory 44.6 MB Beats 14.31%
// June 24, 2023

// Iterative Solution
public class NAryTreePreorderTraversal_589 {
    public List<Integer> preorder(Node root) {
        List<Integer> pre=new ArrayList<>();
        if(root==null) return pre;
        Stack<Node> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node temp=st.pop();
            pre.add(temp.val);
            for(int i=temp.children.size()-1;i>=0;i--){
                Node n=temp.children.get(i);
                st.push(n);
            }
        }
        return pre;
    }
}

// Runtime 1 ms Beats 87.94%
// Memory 44.5 MB Beats 26.12%
// June 24, 2023

// Recursive Solution
// public class NAryTreePreorderTraversal_589 {
//     public List<Integer> preorder(Node root) {
//         List<Integer> pre=new ArrayList<>();
//         if(root==null) return pre;
//         helper(root,pre);
//         return pre;
//     }
//     void helper(Node node,List<Integer> pre){
//         pre.add(node.val);
//         for(Node n:node.children){
//             if(n!=null) helper(n,pre);
//         }
//     }
// }