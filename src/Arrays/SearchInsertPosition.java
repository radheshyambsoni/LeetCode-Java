package Arrays;

// Topic - Arrays, Binary Search
// 35. Search Insert Position
// https://leetcode.com/problems/search-insert-position/
// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity

public class SearchInsertPosition{
    // Using binary search
    public int searchInsert(int[] nums, int target) {
        int start=0, end=nums.length-1;        
        int mid=start+((end-start)/2);
        while(start<=end){            
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                start=++mid;
                mid=start+((end-start)/2);
            }else if(nums[mid]>target){
                end=--mid;
                mid=start+((end-start)/2);
            }
        }
        
        return mid;
    }
}