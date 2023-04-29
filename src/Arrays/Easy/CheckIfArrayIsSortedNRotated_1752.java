package Arrays.Easy;

// 1752. Check if Array Is Sorted and Rotated
// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
// Runtime 0 ms Beats 100%
// Memory 40.4 MB Beats 51.13%
// Apr 29, 2023

public class CheckIfArrayIsSortedNRotated_1752 {
    public boolean check(int[] nums) {
        int i=0,pivot=-1;
        while(i<nums.length-1){
            if(nums[i]>nums[i+1]){
                pivot=i;
                break;
            }
            i++;
        }
        if(i==nums.length-1) return true;
        i++;
        while(i<nums.length-1){
            if(nums[i]>nums[i+1] || nums[i]>nums[0]){
                return false;
            }
            i++;
        }
        if(nums[i]>nums[0]) return false;
        return true;
    }
}
