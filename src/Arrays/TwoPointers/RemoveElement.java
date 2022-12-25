package Arrays.TwoPointers;

// https://leetcode.com/problems/remove-element/
// Runtime 0 ms Beats 100%
// Memory 40.9 MB Beats 81.56%
// Related Topics - Arrays Two Pointers
// December 25, 2022

public class RemoveElement{
    public int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j++]=temp;
            }
        }
        return j;
    }
}