package DP.Medium;

// 494. Target Sum
// https://leetcode.com/problems/target-sum/
// Runtime 3 ms Beats 96.4%
// Memory 39.8 MB Beats 95.81%
// Aug 13, 2023

public class TargetSum_494 {
    int f(int[] arr, int diff) {
        int n = arr.length;
        int totSum = 0;
        for (int num : arr)
            totSum += num;

        // 1) s1 - s2 = d
        // 2) s1 + s2 = totSum
        // so we have to find the count of either s1 or s2
        // as count of s1 and s2 will be same as (2)
        totSum -= diff; // s2 = (totSum - d)/2;
        // as we're dividing by 2 => it has to be even to give a perfect division
        // otherwise no such partitions exist
        if (totSum < 0 || totSum % 2 == 1)
            return 0;
        totSum /= 2;

        int[] prev = new int[totSum + 1];
        // base condition changes as arr[i] can be 0
        if (arr[0] == 0)
            prev[0] = 2;
        else
            prev[0] = 1;

        if (arr[0] != 0 && arr[0] <= totSum)
            prev[arr[0]] = 1;

        for (int idx = 1; idx < n; idx++) {
            for (int tar = totSum; tar >= 0; tar--) {
                int notTake = prev[tar];
                int take = (arr[idx] <= tar) ? prev[tar - arr[idx]] : 0;
                prev[tar] = (notTake + take);
            }
        }

        return prev[totSum];
    }

    public int findTargetSumWays(int[] nums, int target) {
        // this prblm reminds us of "count of subsets with given diff"
        // why? -> coz when we don't take some elements -> it is a specific subset
        // when we subtract the same that we don't take it becomes -> same as s1 - s2 =
        // d
        return f(nums, target);
    }
}