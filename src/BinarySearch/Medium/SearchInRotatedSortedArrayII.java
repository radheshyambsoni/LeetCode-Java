package BinarySearch.Medium;

// 81. Search in Rotated Sorted Array II
// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

public class SearchInRotatedSortedArrayII {
    // Linear search has better runtime in this case
    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in Rotated Sorted Array II.
    // Memory Usage: 42.3 MB, less than 87.85% of Java online submissions for Search in Rotated Sorted Array II.
    // public boolean search(int[] nums, int target) {
    //     for(int i:nums){
    //         if(i==target){return true;}
    //     }
    //     return false;
    // }

    // the below one is binary search one, but has comparatively bad runtime 
    // Runtime: 1 ms, faster than 86.87% of Java online submissions for Search in Rotated Sorted Array II.
    // Memory Usage: 42.2 MB, less than 87.85% of Java online submissions for Search in Rotated Sorted Array II.
    public boolean binarySearch(int nums[],int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                return true;
            }
        }
        return false;
    }
    public boolean search(int[] nums, int target) {
        int pivot=findPivotWithDuplicates(nums);
        if(pivot==-1){
            return binarySearch(nums, target,0,nums.length-1);
        }

        if(nums[pivot]==target){
            return true;
        }
        if(target>=nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }
        return binarySearch(nums, target, pivot+1,nums.length-1);
    }
    public int findPivotWithDuplicates(int[] arr){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<arr.length-1 && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>0 && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            
            // if elements at middle, start, and end are equal then just skip the duplicated
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                // check if the skipped ones are pivots
                if(start<arr.length-1 && arr[start]>arr[start+1]){
                    return start;
                }
                start++;

                if(end>0 && arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}