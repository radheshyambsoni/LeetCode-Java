package BinarySearch;

// 34. Find First and Last Position of Element in Sorted Array - Medium
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// Related Topics - Arrays, Binary Search

public class Find1stNLastPosOfElementInSortedArr {
    public int[] searchRange(int[] nums, int target) {
        // Runtime 0 ms Beats 100% Memory 45.5 MB Beats 92.37%
        int ans[]={-1,-1};
        ans[0]=search(nums,target,true);
        ans[1]=search(nums,target,false);
        return ans;

        // int start=0,end=nums.length-1;        
        // while(start<=end){
        //     int mid=start+(end-start)/2;
        //     if(nums[mid]==target){
        //         start=mid;
        //         end=mid;
        //         break;       
        //     }else if(nums[mid]>target){
        //         end=mid-1;
        //         mid=start+(end-mid)/2;
        //     }else{
        //         start=mid+1;
        //         mid=start+(end-mid)/2;
        //     }
        // }
        // if(start>end){
        //     return new int[]{-1,-1};
        // }
        // while(start>=0 && nums[start]>=target){
        //     start--;
        // }
        // while(end<nums.length && nums[end]<=target){
        //     end++;
        // }

        // return new int[]{start+1,end-1};
    }

    int search(int[] nums, int target, boolean startOrEnd) {
        int ans=-1,start=0,end=nums.length-1;
        int mid=start+(end-start)/2;
        while(start<=end){
            if(target<nums[mid]){
                end=mid-1;
                mid=start+(end-start)/2;
            }else if(target>nums[mid]){
                start=mid+1;
                mid=start+(end-start)/2;
            }else{
                ans=mid;
                if(startOrEnd){
                    end=mid-1;
                    mid=start+(end-start)/2;
                }else{
                    start=mid+1;
                    mid=start+(end-start)/2;
                }
            }
        }

        return ans;
    }
}
