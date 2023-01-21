package Trees.Medium;

// https://leetcode.com/problems/deepest-leaves-sum/ - Medium
// Runtime 1 ms Beats 100%
// Memory 44.7 MB Beats 81.32%
// January 02, 2023

public class DeepestLeavesSum {
    private int maxDepth=0;
    private int sum=0;
    public int deepestLeavesSum(TreeNode root) {
        if(root.left==null && root.right==null){
            return root.val;
        }
        helper(root, 0);
        return sum;
    }
    void helper(TreeNode node,int d){
        if(node==null){return;}
        if(node.left==null && node.right==null){
            if(d>maxDepth){
                maxDepth=d;
                sum=node.val;
                return;
            }
            if(d==maxDepth){
                sum+=node.val;
            }
        }
        
        helper(node.left, d+1);
        helper(node.right, d+1);
    }
}