package Stacks.Medium;

import java.util.Arrays;
import java.util.Stack;

// 503. Next Greater Element II
// https://leetcode.com/problems/next-greater-element-ii/
// Runtime 9 ms Beats 91.9%
// Memory 44.9 MB Beats 41.38%
// Sep 23, 2023

public class NextGreaterElement2_503 {
    public int[] nextGreaterElements(int[] nums) {
        Stack<int[]> st = new Stack<>();
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[i] > st.peek()[0]) {
                int[] temp = st.pop();
                ans[temp[1]] = nums[i];
            }
            st.push(new int[] { nums[i], i });
        }

        if (!st.isEmpty()) {
            for (int i = 0; i < n; i++) {
                while (!st.isEmpty() && nums[i] > st.peek()[0]) {
                    int[] temp = st.pop();
                    ans[temp[1]] = nums[i];
                }
            }
        }

        return ans;
    }
}