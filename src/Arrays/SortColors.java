package Arrays;

// https://leetcode.com/problems/sort-colors/ - Medium
// Related Topics - Array, Two Pointers, Sorting
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Sort Colors.
// Memory Usage: 40.4 MB, less than 99.29% of Java online submissions for Sort Colors.
class Solution {
    // Hint used: Iterate the array counting number of 0's, 1's, and 2's.
    // Overwrite array with the total number of 0's, then 1's and followed by 2's.

    public void sortColors(int[] nums) {
        // Runtime given above is for second approach
        
        // Follow up: Could you come up with a one-pass algorithm using only constant extra space?
        // dutch national flag algorithm - sorts in one pass
        // right side of hi will become 2
        // left side of low will become 0
        // rest will become 1 
        int lo=0,hi=nums.length-1,mid=0;
        while(mid<=hi){
            if(nums[mid]==0){
                nums[mid++]=nums[lo];
                nums[lo++]=0;                
            }else if(nums[mid]==1){
                mid++;                
            }else{
                nums[mid]=nums[hi];
                nums[hi--]=2;
            }
        }
        
        // int zeros=0,ones=0,twos=0;
        // for(int i:nums){
        //     if(i==0){
        //         zeros++;
        //     }else if(i==1){
        //         ones++;
        //     }else{
        //         twos++;
        //     }
        // }
        // int i=0;
        // while(zeros-->0){
        //     nums[i++]=0;
        // }while(ones-->0){
        //     nums[i++]=1;
        // }while(twos-->0){
        //     nums[i++]=2;
        // }
    }
}