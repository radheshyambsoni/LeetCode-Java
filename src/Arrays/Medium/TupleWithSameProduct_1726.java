package Arrays.Medium;

import java.util.HashMap;

// 1726. Tuple with Same Product
// https://leetcode.com/problems/tuple-with-same-product/
// Runtime 153 ms Beats 96.61%
// Memory 63.20 MB Beats 72.32%

public class TupleWithSameProduct_1726 {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int prod = nums[i] * nums[j];
                map.put(prod, map.getOrDefault(prod, 0) + 1);
            }
        }

        int cnt = 0;
        for (int n : map.values()) {
            cnt += 4 * n * (n - 1);
        }

        return cnt;
    }
}