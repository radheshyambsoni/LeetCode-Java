package BackTracking.Medium;

import java.util.LinkedList;
import java.util.List;

// 39. Combination Sum
// https://leetcode.com/problems/combination-sum/
// Runtime 2 ms Beats 80.1%
// Memory 43.9 MB Beats 8.18%
// May 19, 2023

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates,int target){
        List<List<Integer>> ans=new LinkedList<>();
        helper(candidates, target, ans, new LinkedList<>(), 0);
        return ans;
    }
    public void helper(int[] nums,int target,List<List<Integer>> ans,List<Integer> ds,int idx){
        if(target==0){
            List<Integer> l=new LinkedList<>(ds);
            ans.add(l);
            return;
        }

        if(idx==nums.length){
            return;
        }

        if(nums[idx]<=target){
            ds.add(nums[idx]);
            helper(nums, target-nums[idx], ans, ds, idx);
            ds.remove(ds.size()-1);
        }
        helper(nums, target, ans, ds, idx+1);
    }
}
