package Trees.Medium;

// 513. Find Bottom Left Tree Value
// https://leetcode.com/problems/find-bottom-left-tree-value/
// Runtime 1 ms Beats 67.94%
// Memory 42.5 MB Beats 30.88%
// Apr 15, 2023

public class FindBottomLeftTreeValue_513 {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int ans=root.val;
        while(!q.isEmpty()){
            int l=q.size();
            for(int i=0;i<l;i++){
                TreeNode n=q.poll();
                if(n.right!=null){
                    q.offer(n.right);
                    ans=n.right.val;
                }
                if(n.left!=null){
                    q.offer(n.left);
                    ans=n.left.val;
                }
            }
        }
        return ans;
    }
}
