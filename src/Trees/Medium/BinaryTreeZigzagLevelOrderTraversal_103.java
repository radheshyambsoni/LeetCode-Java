package Trees.Medium;

// 103. Binary Tree Zigzag Level Order Traversal
// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
// Runtime 1 ms Beats 77.69%
// Memory 42.1 MB Beats 13.70%
// Apr 06, 2023

public class BinaryTreeZigzagLevelOrderTraversal_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new LinkedList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){return ans;}
        q.add(root);
        boolean b=false;
        while(!q.isEmpty()){
            int level=q.size();
            List<Integer> l=new LinkedList<>();
            for(int i=0;i<level;i++){
                if(q.peek().left!=null){q.offer(q.peek().left);}
                if(q.peek().right!=null){q.offer(q.peek().right);}
                if(b){
                    l.add(0, q.poll().val);
                }else{
                    l.add(q.poll().val);
                }
            }
            b=!b;
            ans.add(l);
        }
        return ans;
    }
}
