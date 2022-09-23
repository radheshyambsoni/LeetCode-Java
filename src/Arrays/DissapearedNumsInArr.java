package Arrays;

import java.util.List;
import java.util.ArrayList;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Runtime: 6 ms, faster than 92.01% of Java online submissions for Find All Numbers Disappeared in an Array.
// Memory Usage: 50.3 MB, less than 96.51% of Java online submissions for Find All Numbers Disappeared in an Array.

public class DissapearedNumsInArr {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correctIdx=nums[i]-1;
            if(nums[i]<=nums.length && nums[i]!=nums[correctIdx]){
                int temp=nums[i];
                nums[i]=nums[correctIdx];
                nums[correctIdx]=temp;
            }else{
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                ans.add(i+1);
            }
        }
        return ans;
    }
}