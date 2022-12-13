package BackTracking;

import java.util.List;
import java.util.ArrayList;

// https://leetcode.com/problems/permutations/ - Medium
// Runtime 2 ms Beats 78.22%
// Memory 44.9 MB Beats 36.74%
// December 13, 2022

public class Permutations{
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        addPermutations(nums, new boolean[nums.length], new ArrayList<>());
        return ans;
    }
    public void addPermutations(int[] nums,boolean[] track,List<Integer> l){
        if(l.size()==nums.length){
            List<Integer> a=new ArrayList<>(l);
            ans.add(a);
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