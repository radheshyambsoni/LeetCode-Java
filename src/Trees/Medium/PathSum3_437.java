package Trees.Medium;

import java.util.HashMap;

// 437. Path Sum III
// https://leetcode.com/problems/path-sum-iii/
// Runtime 2 ms Beats 100.00%
// Memory 43.35 MB Beats 29.66%
// Nov 21, 2023

public class PathSum3_437 {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }

        return dfs(root, targetSum, 0, new HashMap<>());
    }

    int dfs(TreeNode n, int k, long sum, HashMap<Long, Integer> map) {
        int cnt = 0;
        sum += n.val;

        if (map.containsKey(sum - k)) {
            cnt += map.get(sum - k);
        }

        if (sum == k) {
            cnt += 1;
        }

        map.put(sum, map.getOrDefault(sum, 0) + 1);

        if (n.left != null) {
            cnt += dfs(n.left, k, sum, map);
        }
        if (n.right != null) {
            cnt += dfs(n.right, k, sum, map);
        }

        map.put(sum, map.get(sum) - 1);

        return cnt;
    }
}