package BackTracking;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/subsets/ - Medium
// Runtime 1 ms Beats 82.85%
// Memory 43.3 MB Beats 56.27%
// December 21, 2022

public class Subsets{
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer =new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:nums){
            int n=outer.size();
            for(int i=0;i<n;i++){
                List<Integer> inner=new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }

        return outer;
    }
}