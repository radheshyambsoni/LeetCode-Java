package BackTracking;

import java.util.List;
import java.util.ArrayList;

// https://leetcode.com/problems/permutations/ - Medium

public class Permutations{
    // Runtime 1 ms Beats 95.48%
    // Memory 44.3 MB Beats 57.58%
    // January 03, 2023
    // No space taken for tracking the used elements
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> permute(int[] arr){
        addPermutations(arr,0);
        return ans;
    }
    private void addPermutations(int[] arr,int index) {
        if(index==arr.length){
            List<Integer> ds=new ArrayList<>();
            for(int i:arr){
                ds.add(i);
            }
            ans.add(ds);
            return;
        }

        for(int i=index;i<arr.length;i++){
            swap(arr,index,i);
            addPermutations(arr, index+1);
            swap(arr,index,i);
        }
    }
    private void swap(int[] arr, int index, int i) {
        int temp=arr[index];
        arr[index]=arr[i];
        arr[i]=temp;
    }

    // O(n) space complexity for tracking the elements used
    // // Runtime 1 ms Beats 97.45%
    // // Memory 42.3 MB Beats 93.87%
    // // December 13, 2022
    // List<List<Integer>> ans=new ArrayList<>();
    // public List<List<Integer>> permute(int[] nums) {
    //     addPermutations(nums, new boolean[nums.length], new ArrayList<>());
    //     return ans;
    // }
    // public void addPermutations(int[] nums,boolean[] track,List<Integer> l){
    //     if(l.size()==nums.length){
    //         List<Integer> a=new ArrayList<>(l);
    //         ans.add(a);
    //         return;
    //     }

    //     for(int i=0;i<nums.length;i++){
    //         if(!track[i]){
    //             track[i]=true;
    //             l.add(nums[i]);
    //             addPermutations(nums, track, l);
    //             l.remove(l.size()-1);
    //             track[i]=false;
    //         }
    //     }
    // }
}