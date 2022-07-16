package Arrays;
import java.util.Arrays;

// 34. Find First and Last Position of Element in Sorted Array
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// Related Topics - Array, Binary Search

public class Find1stNLastPosOfElementInSortedArray{
    public static int[] searchRange(int[] nums, int target) {
        int start=0,end=nums.length-1;        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                start=mid;
                end=mid;
                break;       
            }else if(nums[mid]>target){
                end=mid-1;
                mid=start+(end-mid)/2;
            }else{
                start=mid+1;
                mid=start+(end-mid)/2;
            }
        }
        if(start>end){
            return new int[]{-1,-1};
        }
        while(start>=0 && nums[start]>=target){
            start--;
        }
        while(end<nums.length && nums[end]<=target){
            end++;
        }

        return new int[]{start+1,end-1};
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{1,2,6,6,6,8,8},7)));
    }
}