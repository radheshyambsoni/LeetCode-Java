package Arrays.Medium;

// 215. Kth Largest Element in an Array
// https://leetcode.com/problems/kth-largest-element-in-an-array/
// Runtime 3 ms Beats 99.51%
// Memory 55.6 MB Beats 32.27%
// Aug 14, 2023

public class KthLargestElementInAnArr_215 {
    public int findKthLargest(int[] nums, int k) {
        int[] freq = new int[(int) 2e4 + 1];
        for (int i : nums)
            freq[i + (int) 1e4]++;
        int cnt = 0;
        for (int i = (int) 2e4; i >= 0; i--) {
            if (cnt >= k)
                return i + 1 - (int) 1e4;
            cnt += freq[i];
        }

        return -1;
    }
}