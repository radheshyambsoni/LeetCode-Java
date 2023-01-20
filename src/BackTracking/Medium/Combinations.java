package BackTracking.Medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/combinations/ - Medium
// Runtime 1 ms Beats 100%
// Memory 43.9 MB Beats 57.55%
// January 18, 2023 submissions(s)

public class Combinations {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        helper(new ArrayList<>(),1,k,n);
        return ans;
    }
    public void helper(List<Integer> l,int num,int k,int n){
        if(k==0){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=num;i<=n-k+1;i++){
            l.add(i);
            helper(l, i+1, k-1, n);
            l.remove(l.size()-1);
        }
    }
}