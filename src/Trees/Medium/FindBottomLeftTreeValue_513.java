package Trees.Medium;

// 513. Find Bottom Left Tree Value
// https://leetcode.com/problems/find-bottom-left-tree-value/
// Runtime 2 ms Beats 26.49%
// Memory 42.6 MB Beats 15.93%
// Apr 14, 2023

public class FindBottomLeftTreeValue_513 {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int ans=root.val;
        while(!q.isEmpty()){
            int l=q.size();
            LinkedList<Integer> ll=new LinkedList<>();
            for(int i=0;i<l;i++){
                TreeNode n=q.poll();
                if(n.left!=null){
                    q.offer(n.left);
                    ll.add(n.left.val);
                }
                if(n.right!=null){
                    q.offer(n.right);
                    ll.add(n.right.val);
                }
            }
            if(ll.size()!=0) ans=ll.get(0);
        }
        return ans;
    }
}
