package BinarySearch.Easy;

// 704. Binary Search
// https://leetcode.com/problems/binary-search/
// Related Topics - Array, Binary Search

public class BinarySearch{
    public int search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        int mid=start+(end-start)/2;
        while(start<=end){
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                end=mid-1;
                mid=start+(end-start)/2;                
            }else{
                start=mid+1;
                mid=start+(end-start)/2;
            }
        }
        return -1;
    }
}