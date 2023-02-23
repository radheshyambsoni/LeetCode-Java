package Trees.Medium;

// 199. Binary Tree Right Side View
// https://leetcode.com/problems/binary-tree-right-side-view/
// Runtime 0 ms Beats 100%
// Memory 43.7 MB Beats 5.97%
// Feb 23, 2023

public class BinaryTreeRightSideView_199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null){return ans;}
        helper(root,ans,0);
        return ans;
    }
    void helper(TreeNode node,List<Integer> ans,int level){
        if(node==null){
            return;
        }
        if(level==ans.size()){
            ans.add(node.val);
        }
        helper(node.right,ans,level+1);
        helper(node.left,ans,level+1);
    }
}
