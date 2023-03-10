package Math.Hard;

import java.util.ArrayList;
import java.util.List;

// 60. Permutation Sequence
// https://leetcode.com/problems/permutation-sequence/
// Runtime 1 ms Beats 99.67%
// Memory 39.9 MB Beats 75.13%
// January 28, 2023

public class PermutSeq {
    public String getPermutation(int n, int k) {
        int fact=1;
        List<Integer> nums=new ArrayList<>();
        for(int i=1;i<n;i++){
            fact*=i;
            nums.add(i);
        }
        nums.add(n);
        StringBuilder ans=new StringBuilder();
        k--;
        while(true){
            ans.append(nums.get(k/fact));
            // nums.remove(Integer.valueOf(k/fact));
            nums.remove(k/fact);
            if(nums.size()==0){
                break;
            }
            k%=fact;
            fact/=nums.size();
        }
        return ans.toString();
    }
}