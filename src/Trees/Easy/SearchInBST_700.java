package Trees.Easy;

// 700. Search in a Binary Search Tree
// https://leetcode.com/problems/search-in-a-binary-search-tree/
// Runtime 0 ms Beats 100%
// Memory 51.4 MB Beats 9.26%
// Feb 21, 2023

public class SearchInBST_700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null){
            return null;
        }
        if(root.val==val){
            return root;
        }else if(root.val<val){
            return searchBST(root.right,val);
        }else{
            return searchBST(root.left,val);
        }
    }
}
