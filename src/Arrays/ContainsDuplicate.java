package Arrays;

import java.util.HashSet;

// 217. Contains Duplicate - Easy
// https://leetcode.com/problems/contains-duplicate/
// Related Topics - Array, Hash Table, Sorting

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!hs.add(nums[i])){
                return true;
            }
        }

        return false;
    }
}