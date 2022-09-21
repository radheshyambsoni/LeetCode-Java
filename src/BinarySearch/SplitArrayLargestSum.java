<<<<<<< HEAD
package BinarySearch;

public class SplitArrayLargestSum {
    public int splitArray(int[] nums, int m) {
        int start=0,end=0;
        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }
        
//         binary search
        while(start<end){
//             try for the mid as potential ans
            int mid=start+(end-start)/2;
            
//             calculate the number of pieces u can divide the array with max sum
            int sum=0,pieces=1;
            for(int num:nums){
                if(sum+num>mid){
//                     u can't add this in the subarray, make new one 
//                     so new sum=num
                    sum=num;
                    pieces++;
                }else{
                    sum+=num;
                }
            }
            
            if(pieces>m){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        
        return end;
    }
=======
// https://leetcode.com/problems/split-array-largest-sum/ - Hard
// Runtime: 1 ms, faster than 87.69% of Java online submissions for Split Array Largest Sum.
// Memory Usage: 39.9 MB, less than 92.32% of Java online submissions for Split Array Largest Sum.

public class SplitArrayLargestSum {
    public int splitArray(int[] nums, int m) {
        int start=0,end=0;
        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }
        
//         binary search
        while(start<end){
//             try for the mid as potential ans
            int mid=start+(end-start)/2;            
//             calculate the number of pieces u can divide the array with max sum
            int sum=0,pieces=1;
            for(int num:nums){
                if(sum+num>mid){
//                     u can't add this in the subarray, make new one 
//                     so new sum=num
                    sum=num;
                    pieces++;
                }else{
                    sum+=num;
                }
            }
            
            if(pieces>m){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        
        return end;
    }
>>>>>>> daee9a78a71a29bba4b2e7ab5a4f03b597f26ab5
}