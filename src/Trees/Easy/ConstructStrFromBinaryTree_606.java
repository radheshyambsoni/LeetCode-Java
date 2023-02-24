package Trees.Easy;

// 606. Construct String from Binary Tree
// https://leetcode.com/problems/construct-string-from-binary-tree/
// Runtime 1 ms Beats 100%
// Memory 46.2 MB Beats 9.18%
// Feb 24, 2023

public class ConstructStrFromBinaryTree_606 {
    public String tree2str(TreeNode root) {
        StringBuilder ans=new StringBuilder();
        helper(root,ans);
        return ans.toString();
    }
    void helper(TreeNode node,StringBuilder ans){
        if(node.left==null && node.right==null){
            ans.append(node.val);
            return;
        }

        ans.append(node.val);
        ans.append('(');
        if(node.left!=null){
            helper(node.left,ans);
        }
        ans.append(')');
        if(node.right!=null){
            ans.append('(');
            helper(node.right,ans);
            ans.append(')');
        }
    }
}