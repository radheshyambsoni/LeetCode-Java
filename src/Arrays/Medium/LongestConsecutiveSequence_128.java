package Arrays.Medium;

import java.util.HashSet;

// 128. Longest Consecutive Sequence
// https://leetcode.com/problems/longest-consecutive-sequence/
// Runtime 35 ms Beats 64.93%
// Memory 56.6 MB Beats 78.28%
// Jul 11, 2023

public class LongestConsecutiveSequence_128 {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1) return nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums) set.add(i);

        int maxLength=1;
        for(int i:set){
            if(!set.contains(i-1)){
                int curr=i;
                int cnt=1;
                while(set.contains(++curr)) cnt++;
                maxLength=Math.max(maxLength,cnt);
            }
        }
        return maxLength;
    }
}