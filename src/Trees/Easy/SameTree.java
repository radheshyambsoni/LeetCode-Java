package Trees.Easy;

// https://leetcode.com/problems/same-tree/ - Easy
// Runtime 0 ms Beats 100%
// Memory 40 MB Beats 62.93%
// January 10, 2023 - Daily Challenge

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){return true;}
        if((p==null && q!=null) || (p!=null && q==null) || p.val!=q.val){return false;}

        if(!isSameTree(p.left,q.left)){return false;}
        if(!isSameTree(p.right,q.right)){return false;}

        return true;
    }    
}