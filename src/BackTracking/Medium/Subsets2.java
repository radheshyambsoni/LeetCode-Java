package BackTracking.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/subsets-ii/ - Medium
// Runtime 1 ms Beats 99.94%
// Memory 42.7 MB Beats 76.22%
// January 02, 2023

public class Subsets2 {
    private List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums){
        Arrays.sort(nums);
        helper(nums, new ArrayList<>(), 0);
        return ans;
    }
    void helper(int[] arr,List<Integer> ds,int index){
        ans.add(new ArrayList<>(ds));
        for(int i=index;i<arr.length;i++){
            if(i!=index && arr[i]==arr[i-1]) continue;
            ds.add(arr[i]);
            helper(arr, ds, i+1);
            ds.remove(ds.size()-1);
        }
    }
}