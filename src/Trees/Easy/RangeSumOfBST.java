package Trees.Easy;

// https://leetcode.com/problems/range-sum-of-bst/
// Runtime  0 ms Beats 100%
// Memory 49.9 MB Beats 88.18%
// December 07, 2022 - Daily Challenge

public class RangeSumOfBST{
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null){
            return 0;
        }
        if(root.val>=low && root.val<=high){
            return root.val+rangeSumBST(root.left, low, high)+rangeSumBST(root.right, low, high);
        }
        if(root.val<low){
            return rangeSumBST(root.right, low, high);
        }else{
            return rangeSumBST(root.left, low, high);
        }
    }   
}