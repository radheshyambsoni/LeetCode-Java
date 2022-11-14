package BinarySearch;

public class FindMinInRotatedSortedArr {
    // Runtime 1 ms Beats 60.13%
    // Memory 43 MB Beats 10.1%
    // public int findPivot(int[] arr ){
    //     int start=0,end=arr.length-1;
    //     while(start<=end){
    //         int mid=start+(end-start)/2;
    //         if(mid<end && arr[mid]>arr[mid+1]){
    //             return mid;
    //         }
    //         if(mid>start && arr[mid]<arr[mid-1]){
    //             return mid-1;
    //         }
    //         if(arr[mid]<arr[start]){
    //             end=mid-1;
    //         }else{
    //             start=mid+1;
    //         }
    //     }
    //     return -1;
    // }
    // public int findMin(int[] nums) {
    //     return nums[findPivot(nums)+1];
    // }

    // Runtime 0 ms Beats 100%
    // Memory 42.9 MB Beats 19.87%
    public int findMin(int[] nums) {
        if(nums[0]<nums[nums.length-1]){
            return nums[0];
        }
        int s=0,e=nums.length-1;        
        while(s<e){
            int m=s+(e-s)/2;
            if(nums[m]<nums[0]){
                e=m;
            }else{
                s=m+1;
            }
        }
        return nums[e];
    }
}