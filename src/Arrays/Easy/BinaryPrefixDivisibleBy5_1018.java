package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

// 1018. Binary Prefix Divisible By 5
// https://leetcode.com/problems/binary-prefix-divisible-by-5/description/
// Runtime 4 ms Beats 39.60%
// Memory 43.2 MB Beats 67.11%
// March 05, 2023

public class BinaryPrefixDivisibleBy5_1018 {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int val=0;
        List<Boolean> ans=new ArrayList<>();
        for(int i:nums){
            // to avoid overflow we keep doing mod of val
            val=(val*2+i)%5;
            ans.add(val==0);
        }
        return ans;
    }
}