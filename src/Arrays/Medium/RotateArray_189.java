package Arrays.Medium;

// 189. Rotate Array
// https://leetcode.com/problems/rotate-array/
// Runtime 0 ms Beats 100%
// Memory 56.1 MB Beats 64.66%
// June 28, 2023

public class RotateArray_189 {
    void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i++]=arr[j];
            arr[j--]=temp;
        }
    }
    public void rotate(int[] nums, int k) {
        if(k>nums.length) k=k%nums.length;
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
}