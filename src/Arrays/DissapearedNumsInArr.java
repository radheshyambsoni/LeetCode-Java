package Arrays;

import java.util.List;
import java.util.ArrayList;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/ - Easy
// Runtime 5 ms Beats 96.69%
// Memory 50.8 MB Beats 84.67%

public class DissapearedNumsInArr {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // December 15, 2022
        // Negate each number while traversing
        // Run again and find the index that is not negated.
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int correctIdx=Math.abs(nums[i])-1;
            if(nums[correctIdx]>0){
                nums[correctIdx]*=-1;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans.add(i+1);
            }
        }

        return ans;
        
        // Runtime: 6 ms, faster than 92.01% of Java online submissions for Find All Numbers Disappeared in an Array.
        // Memory Usage: 50.3 MB, less than 96.51% of Java online submissions for Find All Numbers Disappeared in an Array.
        // int i=0;
        // while(i<nums.length){
        // int correctIdx=nums[i]-1;
        //      if(nums[i]<=nums.length && nums[i]!=nums[correctIdx]){
        //          int temp=nums[i];
        //          nums[i]=nums[correctIdx];
        //          nums[correctIdx]=temp;
        //      }else{
        //            i++;
        //      }
        // }
        // List<Integer> ans=new ArrayList<>();
        // for(i=0;i<nums.length;i++){
        //      if(nums[i]!=i+1){
        //          ans.add(i+1);
        //          }
        //      }
        // return ans;
    }
}
