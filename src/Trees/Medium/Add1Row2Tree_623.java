package Trees.Medium;

// 623. Add One Row to Tree
// https://leetcode.com/problems/add-one-row-to-tree/
// Runtime 0 ms Beats 100%
// Memory 42 MB Beats 68.71%
// Apr 05, 2023

public class Add1Row2Tree_623 {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode newRoot=new TreeNode(val);
            newRoot.left=root;
            return newRoot;
        }
        
        // false - left, true - right
        helper(root,root.left,val,depth-1,false);
        helper(root,root.right,val,depth-1,true);
        return root;
    }
    void helper(TreeNode p,TreeNode n,int v,int d,boolean dir){
        if(n==null){
            if(d==1){
                if(dir) p.right=new TreeNode(v);
                else p.left=new TreeNode(v);
            }
            return;
        }else{
            if(d==1){
                if(dir){
                    TreeNode t=p.right;
                    p.right=new TreeNode(v);
                    p.right.right=n;
                }else{
                    TreeNode t=p.left;
                    p.left=new TreeNode(v);
                    p.left.left=n;
                }
                return;
            }
        }

        helper(n,n.left,v,d-1,false);
        helper(n,n.right,v,d-1,true);
    }
}
