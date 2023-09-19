package PriorityQueue.Medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

// 347. Top K Frequent Elements
// https://leetcode.com/problems/top-k-frequent-elements/
// Runtime 13 ms Beats 73.65%
// Memory 47.6 MB Beats 46.30%
// Sep 19, 2023

public class TopKFrequentElements_347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (int key : map.keySet()) {
            pq.add(new int[] { key, map.get(key) });
        }

        int[] kFreq = new int[k];
        for (int i = 0; i < k; i++) {
            kFreq[i] = pq.poll()[0];
        }

        return kFreq;
    }
}