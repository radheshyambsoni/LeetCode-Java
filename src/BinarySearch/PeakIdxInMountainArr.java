package BinarySearch;

// 852. Peak Index in a Mountain Array - Medium
// https://leetcode.com/problems/peak-index-in-a-mountain-array/
// Related Topics - Arrays, Binary Search

public class PeakIdxInMountainArr{
    public int peakIndexInMountainArray(int[] arr) {
        int start=0,end=arr.length-1;
        int mid=start+(end-start)/2;
        while(start<end){            
            if(arr[mid+1]>arr[mid]){
                start=mid+1;
                mid=start+(end-start)/2;
            }else if(arr[mid]>arr[mid+1]){
                end=mid;
                mid=start+(end-start)/2;
            }
        }
        return start;
    }
}