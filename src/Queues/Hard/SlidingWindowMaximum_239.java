package Queues.Hard;

import java.util.ArrayDeque;
import java.util.Deque;

// 239. Sliding Window Maximum
// https://leetcode.com/problems/sliding-window-maximum/
// Runtime 31 ms Beats 82.85%
// Memory 59.5 MB Beats 70.89%
// Aug 16, 2023

public class SlidingWindowMaximum_239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        Deque<Integer> window = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!window.isEmpty() && window.peekFirst() < i - k + 1) {
                window.pollFirst();
            }

            while (!window.isEmpty() && nums[window.peekLast()] < nums[i]) {
                window.pollLast();
            }

            window.offerLast(i);

            if (i >= k - 1) {
                ans[i - k + 1] = nums[window.peekFirst()];
            }
        }

        return ans;
    }
}