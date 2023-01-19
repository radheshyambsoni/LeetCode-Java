package BackTracking;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/combination-sum-iii/ - Medium
// Runtime 0 ms Beats 100%
// Memory 40 MB Beats 73.7%
// January 19, 2023

public class CombinationSum3 {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        helper(new ArrayList<>(),1,k,n,0);
        return ans;
    }
    public void helper(List<Integer> l,int num,int k,int n,int sum){
        if(k==0){
            if(sum==n){
                ans.add(new ArrayList<>(l));
            }
            return;
        }
        for(int i=num;i<=9-k+1;i++){
            l.add(i);
            helper(l, i+1, k-1, n,sum+i);
            l.remove(l.size()-1);
        }
    }
}