package Trees.Easy;

// 404. Sum of Left Leaves
// https://leetcode.com/problems/sum-of-left-leaves/
// Runtime 0 ms Beats 100%
// Memory 40.1 MB Beats 78.89%
// February 01, 2023

public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        return helper(root,false,0);
    }
    int helper(TreeNode node,boolean b,int sum){
        if(node==null){return 0;}
        if(node.left==null && node.right==null){
            return b?node.val:0;
        }
        return helper(node.left,true,sum)+helper(node.right,false,sum);
    }
}