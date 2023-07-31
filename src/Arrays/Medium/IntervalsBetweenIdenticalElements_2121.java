package Arrays.Medium;

import java.util.Arrays;

// import java.util.HashMap;
// import java.util.Map;

// 2121. Intervals Between Identical Elements
// https://leetcode.com/problems/intervals-between-identical-elements/
// Jul 31, 2023

// Using arrays as hashtables
// Runtime 14 ms Beats 100%
// Memory 66.9 MB Beats 82.29%
class Solution {
    public long[] getDistances(int[] arr) {
        int maxNum = 0;
        for (int num : arr)
            maxNum = Math.max(maxNum, num);

        long[] sumMap = new long[maxNum + 1];
        int[] cntMap = new int[maxNum + 1];
        long[] ans = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] += i * (long) cntMap[arr[i]] - sumMap[arr[i]];
            sumMap[arr[i]] += i;
            cntMap[arr[i]]++;
        }

        Arrays.fill(sumMap, 0);
        Arrays.fill(cntMap, 0);
        for (int i = arr.length - 1; i >= 0; i--) {
            ans[i] += (arr.length - i - 1) * (long) cntMap[arr[i]] - sumMap[arr[i]];
            sumMap[arr[i]] += (arr.length - i - 1);
            cntMap[arr[i]]++;
        }
        return ans;
    }
}

// // Using HashMaps
// // Runtime 175 ms Beats 21.87%
// // Memory 66 MB Beats 88.54%
// public class IntervalsBetweenIdenticalElements_2121 {
// public long[] getDistances(int[] arr) {
// long[] ans = new long[arr.length];
// Map<Integer, Long> sumMap = new HashMap<>();
// Map<Integer, Integer> cntMap = new HashMap<>();
// for (int i = 0; i < arr.length; i++) {
// if (!sumMap.containsKey(arr[i])) {
// sumMap.put(arr[i], 0l);
// cntMap.put(arr[i], 0);
// }

// ans[i] += i * (long) cntMap.get(arr[i]) - sumMap.get(arr[i]);
// sumMap.put(arr[i], sumMap.get(arr[i]) + i);
// cntMap.put(arr[i], cntMap.get(arr[i]) + 1);
// }

// sumMap = new HashMap<>();
// cntMap = new HashMap<>();
// for (int i = arr.length - 1; i >= 0; i--) {
// if (!sumMap.containsKey(arr[i])) {
// sumMap.put(arr[i], 0l);
// cntMap.put(arr[i], 0);
// }

// ans[i] += (arr.length - i - 1) * (long) cntMap.get(arr[i]) -
// sumMap.get(arr[i]);
// sumMap.put(arr[i], sumMap.get(arr[i]) + (arr.length - i - 1));
// cntMap.put(arr[i], cntMap.get(arr[i]) + 1);
// }
// return ans;
// }
// }

// TLE
// class Solution {
// public long[] getDistances(int[] arr) {
// Map<Integer, List<Integer>> map = new HashMap<>();
// for(int i=0;i<arr.length;i++){
// if(map.containsKey(arr[i])){
// map.get(arr[i]).add(i);
// }else {
// List<Integer> l = new ArrayList<>();
// l.add(i);
// map.put(arr[i], l);
// }
// }

// long[] ans = new long[arr.length];
// for(int i=0;i<arr.length;i++){
// List<Integer> l = map.get(arr[i]);
// for(int j=0;j<l.size();j++){
// ans[i] += Math.abs(l.get(j)-i);
// }
// }
// return ans;
// }
// }