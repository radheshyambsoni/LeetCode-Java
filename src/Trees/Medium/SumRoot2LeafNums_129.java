package Trees.Medium;

// 129. Sum Root to Leaf Numbers
// https://leetcode.com/problems/sum-root-to-leaf-numbers/
// Runtime 0 ms Beats 100%
// Memory 42.4 MB Beats 5.46%
// Feb 22, 2023

public class SumRoot2LeafNums_129 {
    public int sumNumbers(TreeNode root) {
        return helper(root,0,0);
    }
    int helper(TreeNode node,int val,int sum){
        if(node.left==null && node.right==null){
            return sum+=val*10+node.val;
        }
        val=val*10+node.val;
        if(node.left!=null){
            sum=helper(node.left,val,sum);
        }
        if(node.right!=null){
            sum=helper(node.right,val,sum);
        }
        return sum;
    }
}
