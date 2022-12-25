package Arrays.TwoPointers;

// https://leetcode.com/problems/next-permutation/ - Medium
// Runtime 0 ms Beats 100%
// Memory 42.8 MB Beats 74.75%
// December 25, 2022

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if(nums.length==1){
            return;
        }
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){i--;}
        if(i>=0){
            int j=nums.length-1;
            while(nums[j]<=nums[i]){j--;}
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }

        int j=nums.length-1;
        i++;
        while(i<j){
            int temp=nums[i];
            nums[i++]=nums[j];
            nums[j--]=temp;
        }
    }
}