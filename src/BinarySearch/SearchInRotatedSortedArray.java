package BinarySearch;

// 33. Search in Rotated Sorted Array - Medium
// https://leetcode.com/problems/search-in-rotated-sorted-array/
// Related Topics - Arrays, Binary Search
// Runtime: 1 ms, faster than 76.45% of Java online submissions for Search in Rotated Sorted Array.
// Memory Usage: 42.7 MB, less than 47.98% of Java online submissions for Search in Rotated Sorted Array.

// Rotated Binary Search
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(search(arr,2));
    }
    static int binarySearch(int nums[],int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static int search(int[] nums,int target){
        int pivot=findPivot(nums);
        if(pivot==-1){
            return binarySearch(nums, target,0,nums.length-1);
        }

        if(nums[pivot]==target){
            return pivot;
        }
        if(target>=nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }
        return binarySearch(nums, target, pivot+1,nums.length-1);
    }
    static int findPivot(int[] arr ){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<arr.length-1 && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>0 && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<arr[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
