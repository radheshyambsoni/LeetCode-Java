package BinarySearch;

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/ - Hard
// Runtime 1 ms Beats 82.44%
// Memory 43.9 MB Beats 21.34%

public class FindMinInRotatedSortedArr2 {
    public int findPivotWithDuplicates(int[] arr){
        // this method is copied from SearchInRotatedSortedArrayII
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
    public int findMin(int[] arr) {
        return arr[findPivotWithDuplicates(arr)+1];
    }
}
