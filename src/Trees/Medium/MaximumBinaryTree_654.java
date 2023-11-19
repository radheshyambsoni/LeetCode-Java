package Trees.Medium;

// 654. Maximum Binary Tree
// https://leetcode.com/problems/maximum-binary-tree/
// Runtime 2 ms Beats 62.45%
// Memory 44.18 MB Beats 12.35%
// Nov 19, 2023

public class MaximumBinaryTree_654 {
    int[] findMax(int[] arr, int l, int r) {
        int max = -1, maxIdx = -1;
        for (int k = l; k <= r && k < arr.length; k++) {
            if (max < arr[k]) {
                max = arr[k];
                maxIdx = k;
            }
        }

        if (maxIdx != -1) {
            arr[maxIdx] = -1;
        }

        return new int[] { max, maxIdx };
    }

    void f(int[] nums, int l, int r, int idx, TreeNode curr) {
        int[] left = findMax(nums, l, idx - 1);
        if (left[1] != -1) {
            curr.left = new TreeNode(left[0]);
            f(nums, l, idx - 1, left[1], curr.left);
        }

        int[] right = findMax(nums, idx + 1, r);
        if (right[1] != -1) {
            curr.right = new TreeNode(right[0]);
            f(nums, idx + 1, r, right[1], curr.right);
        }
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int[] arr = findMax(nums, 0, nums.length - 1);
        TreeNode root = new TreeNode(arr[0]);

        f(nums, 0, nums.length - 1, arr[1], root);

        return root;
    }
}