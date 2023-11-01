package Trees.Easy;

import java.util.ArrayList;
import java.util.HashMap;

// 501. Find Mode in Binary Search Tree
// https://leetcode.com/problems/find-mode-in-binary-search-tree/
// Runtime 4 ms Beats 63.96%
// Memory 43.94 MB Beats 64.72%
// Nov 01, 2023

public class FindModeInBinarySearchTree_501 {
    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = dfs(root, map, 0);

        ArrayList<Integer> l = new ArrayList<>();

        for (int key : map.keySet()) {
            if (map.get(key) == max) {
                l.add(key);
            }
        }

        int[] ans = new int[l.size()];
        int i = 0;
        for (int mode : l) {
            ans[i++] = mode;
        }

        return ans;
    }

    int dfs(TreeNode node, HashMap<Integer, Integer> map, int max) {
        if (!map.containsKey(node.val)) {
            map.put(node.val, 1);
            max = Math.max(max, 1);
        } else {
            int cnt = map.get(node.val);
            map.put(node.val, cnt + 1);
            max = Math.max(max, cnt + 1);
        }

        if (node.left != null) {
            max = Math.max(max, dfs(node.left, map, max));
        }

        if (node.right != null) {
            max = Math.max(max, dfs(node.right, map, max));
        }

        return max;
    }
}