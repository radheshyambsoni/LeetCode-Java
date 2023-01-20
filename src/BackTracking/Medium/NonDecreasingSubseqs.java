package BackTracking.Medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://leetcode.com/problems/non-decreasing-subsequences/ - Medium
// Runtime 13 ms Beats 63.9%
// Memory 49.2 MB Beats 69.9%
// January 20, 2023 - Daily Challenge

public class NonDecreasingSubseqs {
    Set<List<Integer>> help=new HashSet<>();
    public List<List<Integer>> findSubsequences(int[] nums){
        helper(new ArrayList<>(),nums,0);
        return new ArrayList<>(help);
    }
    private void helper(List<Integer> l, int[] nums,int index) {
        if(index==nums.length){
            if(l.size()>=2){
                help.add(new ArrayList<>(l));
            }
            return;
        }
        if(l.isEmpty() || l.get(l.size()-1)<=nums[index]){
            l.add(nums[index]);
            helper(l, nums, index+1);
            l.remove(l.size()-1);
        }
        helper(l, nums, index+1);
    }
}