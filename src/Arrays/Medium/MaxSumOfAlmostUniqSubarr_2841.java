package Arrays.Medium;

import java.util.HashMap;
import java.util.List;

// 2841. Maximum Sum of Almost Unique Subarray
// https://leetcode.com/problems/maximum-sum-of-almost-unique-subarray/
// Runtime 19 ms Beats 86.44%
// Memory 46.54 MB Beats 41.24%
// Dec 14, 2023

public class MaxSumOfAlmostUniqSubarr_2841 {
    public long maxSum(List<Integer> nums, int m, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int distinctCnt = 0, n = nums.size();
        long preSum = 0, max = 0;
        for (int i = 0; i < k - 1; i++) {
            int num = nums.get(i);
            int freq = map.getOrDefault(num, 0);
            map.put(num, freq + 1);
            if (freq == 0) {
                distinctCnt++;
            }

            preSum += num;
        }

        for (int i = k - 1; i < n; i++) {
            int num = nums.get(i);
            int freq = map.getOrDefault(num, 0);
            map.put(num, freq + 1);
            if (freq == 0) {
                distinctCnt++;
            }

            preSum += num;

            if (distinctCnt >= m) {
                max = Math.max(max, preSum);
            }

            // remove (i - k)th element and update map, distinctCnt and preSum accordingly
            num = nums.get(i - k + 1);
            preSum -= num;
            freq = map.get(num);
            if (freq == 1) {
                map.remove(num);
                distinctCnt--;
            } else {
                map.put(num, freq - 1);
            }
        }

        return max;
    }
}