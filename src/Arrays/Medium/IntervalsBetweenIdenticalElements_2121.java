package Arrays.Medium;

import java.util.HashMap;
import java.util.Map;

// 2121. Intervals Between Identical Elements
// https://leetcode.com/problems/intervals-between-identical-elements/
// Runtime 175 ms Beats 21.87%
// Memory 66 MB Beats 88.54%

public class IntervalsBetweenIdenticalElements_2121 {
    public long[] getDistances(int[] arr) {
        long[] ans = new long[arr.length];
        Map<Integer, Long> sumMap = new HashMap<>();
        Map<Integer, Integer> cntMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!sumMap.containsKey(arr[i])) {
                sumMap.put(arr[i], 0l);
                cntMap.put(arr[i], 0);
            }

            ans[i] += i * (long) cntMap.get(arr[i]) - sumMap.get(arr[i]);
            sumMap.put(arr[i], sumMap.get(arr[i]) + i);
            cntMap.put(arr[i], cntMap.get(arr[i]) + 1);
        }

        sumMap = new HashMap<>();
        cntMap = new HashMap<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!sumMap.containsKey(arr[i])) {
                sumMap.put(arr[i], 0l);
                cntMap.put(arr[i], 0);
            }

            ans[i] += (arr.length - i - 1) * (long) cntMap.get(arr[i]) - sumMap.get(arr[i]);
            sumMap.put(arr[i], sumMap.get(arr[i]) + (arr.length - i - 1));
            cntMap.put(arr[i], cntMap.get(arr[i]) + 1);
        }
        return ans;
    }
}