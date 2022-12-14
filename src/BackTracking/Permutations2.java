package BackTracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://leetcode.com/problems/permutations-ii/
// Runtime 38 ms Beats 25.25%
// Memory 43.1 MB Beats 88.72%
// December 14, 2022

public class Permutations2 {
    List<List<Integer>> ans;
    Set<List<Integer>> set=new HashSet<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        addPermutations(nums, new boolean[nums.length], new ArrayList<>());
        ans=new ArrayList<>(set);
        return ans;
    }
    public void addPermutations(int[] nums,boolean[] track,List<Integer> l){
        if(l.size()==nums.length){
            List<Integer> a=new ArrayList<>(l);
            set.add(a);
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!track[i]){
                track[i]=true;
                l.add(nums[i]);
                addPermutations(nums, track, l);
                l.remove(l.size()-1);
                track[i]=false;
            }
        }
    }
}