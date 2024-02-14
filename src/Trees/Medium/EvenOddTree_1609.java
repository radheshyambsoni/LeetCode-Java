package Trees.Medium;

import java.util.LinkedList;
import java.util.Queue;

// 1609. Even Odd Tree
// https://leetcode.com/problems/even-odd-tree/
// Runtime 10 ms Beats 87.50%
// Memory 65.90 MB Beats 58.27%
// Feb 14, 2024

public class EvenOddTree_1609 {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean isOddL = false;
        while (!q.isEmpty()) {
            int size = q.size();
            int prev = isOddL ? (int) 1e7 : -1;
            for (int i = 0; i < size; i++) {
                TreeNode n = q.poll();
                if (isOddL && (n.val >= prev || n.val % 2 != 0)) {
                    return false;
                } else if (!isOddL && (n.val <= prev || n.val % 2 != 1)) {
                    return false;
                }

                prev = n.val;

                if (n.left != null) {
                    q.offer(n.left);
                }
                if (n.right != null) {
                    q.offer(n.right);
                }
            }

            isOddL = !isOddL;
        }

        return true;
    }
}