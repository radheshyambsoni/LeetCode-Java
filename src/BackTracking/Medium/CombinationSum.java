package BackTracking.Medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/combination-sum/ - Medium
// Runtime 3 ms Beats 88.58%
// Memory 44.9 MB Beats 46.88%

public class CombinationSum {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates,int target){
        findCombinations(candidates,target,new ArrayList<>(),0);
        return ans;
    }
    public void findCombinations(int[] candidates,int target,List<Integer> temp,int index){
        if(target==0){            
            List<Integer> a=new ArrayList<>(temp);
            ans.add(a);                        
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(candidates[i]<=target){
                temp.add(candidates[i]);
                findCombinations(candidates, target-candidates[i], temp,i);
                temp.remove(temp.size()-1);
            }else{
                continue;
            }
        }
    }
}
