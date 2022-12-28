package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/combination-sum-ii/
// Runtime 3 ms Beats 92.22%
// Memory 42.3 MB Beats 94.27%
// December 28, 2022

public class CombinationSum2 {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        findCombinations(candidates,target,new ArrayList<>(),0);
        return ans;
    }
    public void findCombinations(int[] candidates,int target,List<Integer> temp,int index){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(candidates[i]<=target){
                if(i>index && candidates[i]==candidates[i-1]){continue;} // plays key role in avoiding duplicates
                temp.add(candidates[i]);
                findCombinations(candidates, target-candidates[i], temp,i+1);
                temp.remove(temp.size()-1);
            }else{
                continue;
            }
        }
    }
}