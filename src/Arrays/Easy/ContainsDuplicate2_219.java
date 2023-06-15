package Arrays.Easy;

import java.util.HashSet;

// 219. Contains Duplicate II
// https://leetcode.com/problems/contains-duplicate-ii/
// Runtime 21 ms Beats 63.62%
// Memory 55.3 MB Beats 43.37%
// Jun 15, 2023

public class ContainsDuplicate2_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<k && i<nums.length;i++){
            if(set.contains(nums[i])) return true;
            else set.add(nums[i]);
        }

        int i=0,j=k;
        while(j<nums.length){
            if(set.contains(nums[j])) return true;
            else set.add(nums[j]);
            set.remove(nums[i]);
            i++;
            j++;
        }
        return false;
    }
}