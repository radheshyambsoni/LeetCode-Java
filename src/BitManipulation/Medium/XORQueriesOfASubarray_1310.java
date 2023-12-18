package BitManipulation.Medium;

// 1310. XOR Queries of a Subarray
// https://leetcode.com/problems/xor-queries-of-a-subarray/description/
// Runtime 2 ms Beats 97.05%
// Memory 55.34 MB Beats 12.24%
// Dec 18, 2023

public class XORQueriesOfASubarray_1310 {
    public int[] xorQueries(int[] arr, int[][] queries) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] ^= arr[i - 1];
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            ans[i] = arr[queries[i][1]] ^ (queries[i][0] == 0 ? 0 : arr[queries[i][0] - 1]);
        }

        return ans;
    }
}