package Trees.Medium;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 515. Find Largest Value in Each Tree Row
// https://leetcode.com/problems/find-largest-value-in-each-tree-row/
// Runtime 2 ms Beats 74.27%
// Memory 43 MB Beats 28.98%

public class FindLargestValueInEachTreeRow_515 {
    public List<Integer> largestValues(TreeNode root) {
        if(root==null) return new LinkedList<>();
        List<Integer> ans=new LinkedList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int level=q.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<level;i++){
                TreeNode temp=q.poll();
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null) q.offer(temp.right);
                max=Math.max(max,temp.val);
            }
            ans.add(max);
        }
        return ans;
    }
}
