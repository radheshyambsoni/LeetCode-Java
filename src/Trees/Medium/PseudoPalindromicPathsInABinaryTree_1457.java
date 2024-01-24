package Trees.Medium;

// 1457. Pseudo-Palindromic Paths in a Binary Tree
// https://leetcode.com/problems/pseudo-palindromic-paths-in-a-binary-tree/
// Runtime 10 ms Beats 82.21%
// Memory 70.17 MB Beats 46.97%
// Jan 24, 2024

public class PseudoPalindromicPathsInABinaryTree_1457 {
    public int pseudoPalindromicPaths(TreeNode root) {
        int[] freq = new int[9];
        return f(root, freq);
    }

    int f(TreeNode n, int[] freq) {
        if (n.left == null && n.right == null) {
            freq[n.val - 1]++;

            boolean check = true;
            for (int i : freq) {
                if (check && i % 2 == 1) {
                    check = false;
                } else if (!check && i % 2 == 1) {
                    freq[n.val - 1]--;
                    return 0;
                }
            }

            freq[n.val - 1]--;
            return 1;
        }

        freq[n.val - 1]++;

        int ret = 0;
        if (n.left != null) {
            ret += f(n.left, freq);
        }
        if (n.right != null) {
            ret += f(n.right, freq);
        }

        freq[n.val - 1]--;

        return ret;
    }
}