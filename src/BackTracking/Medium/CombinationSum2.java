package BackTracking.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/combination-sum-ii/
// Runtime 2 ms Beats 99.97%
// Memory 42.9 MB Beats 73.62%
// December 29, 2022

public class CombinationSum2 {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
        findCombinations(arr,target,new ArrayList<>(),0);
        return ans;
    }
    public void findCombinations(int[] arr,int target,List<Integer> temp,int index){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<arr.length;i++){
            if(arr[i]<=target){
                if(i>index && arr[i]==arr[i-1]){continue;} // plays key role in avoiding duplicates
                temp.add(arr[i]);
                findCombinations(arr, target-arr[i], temp,i+1);
                temp.remove(temp.size()-1);
            }else{
                break;
            }
        }
    }
}