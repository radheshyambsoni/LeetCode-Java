package Arrays;

// RESOLVE
// https://leetcode.com/problems/move-zeroes/ - Easy
// Runtime 1 ms Beats 100%
// Memory 44 MB Beats 83.6%

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if(nums.length==1){return;}
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
        }
    }
}
