package BinarySearch.Medium;

// 162. Find Peak Element - Medium
// https://leetcode.com/problems/find-peak-element/
// Related Topics - Arrays, Binary Search

public class FindPeakElement {
    // Exact same solution as que num 852 - 
    public int findPeakElement(int[] arr) {
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
