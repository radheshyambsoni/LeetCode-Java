package Stacks.Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// 496. Next Greater Element I
// https://leetcode.com/problems/next-greater-element-i/
// Runtime 3 ms Beats 90.1%
// Memory 43.4 MB Beats 57.66%
// Sep 23, 2023

public class NextGreaterElement1_496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums2) {
            while (!st.isEmpty() && num > st.peek()) {
                map.put(st.pop(), num);
            }
            st.push(num);
        }

        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.getOrDefault(nums1[i], -1);
        }

        return ans;
    }
}