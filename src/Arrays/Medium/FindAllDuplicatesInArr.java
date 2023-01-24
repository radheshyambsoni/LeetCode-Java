package Arrays.Medium;

import java.util.List;
import java.util.ArrayList;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/
// Runtime: 10 ms, faster than 63.91% of Java online submissions for Find All Duplicates in an Array.
// Memory Usage: 63.1 MB, less than 85.09% of Java online submissions for Find All Duplicates in an Array.

public class FindAllDuplicatesInArr {
    public static List<Integer> findDuplicates(int[] nums) {
        // Cyclic Sort
        int i=0;
        while(i<nums.length){
            int correctIdx=nums[i]-1;
            if(nums[i]!=nums[correctIdx]){
                int temp=nums[i];
                nums[i]=nums[correctIdx];
                nums[correctIdx]=temp;
            }else{i++;}
        }
        List<Integer> ans=new ArrayList<>();
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}