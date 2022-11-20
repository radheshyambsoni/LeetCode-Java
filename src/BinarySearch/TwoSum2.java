package BinarySearch;

import java.util.Arrays;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/ - Medium
// Related Topics - Array, Two Pointers, Binary Search

public class TwoSum2 {
    // Runtime 0 ms Beats 100%
    // Memory 49.9 MB Beats 58.37%
    public static int[] twoSum(int[] numbers, int target) {
        int start=0,end=numbers.length-1;
        while(start<end){
            if(numbers[start]+numbers[end]==target){
                return new int[]{start+1,end+1};
            }else if(numbers[start]+numbers[end]>target){
                // find the index 'end' such that number[end]<=target-numbers[start]
                end=rightSearch(numbers, start, end, target-numbers[start]);
            }else{
                // find the index 'start' such that number[start]>=target-numbers[end]
                start=leftSearch(numbers, start, end, target-numbers[end]);
            }
        }
        return new int[2];
    }
    public static int leftSearch(int[] nums,int start,int end,int target){
        int s=start,e=end;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]<target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return s;
    }
    public static int rightSearch(int[] nums,int start,int end,int target){
        int s=start,e=end;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]>target){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return e;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1,2,3,4,4,9,56,90}, 8)));
    }

    // Runtime 7 ms Beats 44.1%
    // Memory 44.9 MB Beats 93.17%
    // public int search(int[] nums, int target,int start) {
    //     int end=nums.length-1;
    //     int mid=start+(end-start)/2;
    //     while(start<=end){
    //         if(nums[mid]==target){
    //             return mid;
    //         }else if(nums[mid]>target){
    //             end=mid-1;
    //             mid=start+(end-start)/2;                
    //         }else{
    //             start=mid+1;
    //             mid=start+(end-start)/2;
    //         }
    //     }
    //     return -1;
    // }
    // public int[] twoSum(int[] numbers, int target) {
    //     for(int i=0;i<numbers.length-1;i++){
    //         int j=search(numbers, target-numbers[i],i+1);
    //         if(j!=-1){
    //             return new int[]{i+1,j+1};
    //         }
    //     }
    //     return null;
    // }    
}
