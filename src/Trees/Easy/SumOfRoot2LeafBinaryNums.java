package Trees.Easy;

// 1022. Sum of Root To Leaf Binary Numbers
// https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
// Runtime 0 ms Beats 100%
// Memory 41.9 MB Beats 62.83%
// February 09, 2023

public class SumOfRoot2LeafBinaryNums {
    int sum=0;
    public int sumRootToLeaf(TreeNode root) {
        helper(root,0);
        return sum;
    }
    void helper(TreeNode node,int val){
        if(node.left==null && node.right==null){
            sum+=val*2+node.val;
            return;
        }        
        if(node.left!=null){
            helper(node.left,val*2+node.val);
        }
        if(node.right!=null){
            helper(node.right,val*2+node.val);
        }
    }
}